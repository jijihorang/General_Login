package org.example.login.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.login.dto.BoardListDTO;
import org.example.login.dto.BoardReadDTO;
import org.example.login.dto.BoardRegisterDTO;
import org.example.login.dto.PageRequest;

import java.util.Optional;

public interface BoardMapper {

    int insert(BoardRegisterDTO registerDTO);

    int insertAttach(@Param("bno")Long bno,
                     @Param("fileName")String fileName,
                     @Param("ord")int ord);

    java.util.List<BoardListDTO> listImage(PageRequest pageRequest);

    int count(PageRequest pageRequest);

    Optional<BoardReadDTO> select(Long bno);

}
