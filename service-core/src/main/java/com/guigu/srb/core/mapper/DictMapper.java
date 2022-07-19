package com.guigu.srb.core.mapper;

import com.guigu.srb.core.pojo.dto.ExcelDictDTO;

import java.util.List;

public interface DictMapper {
    void insertBatch(List<ExcelDictDTO> list);
}
