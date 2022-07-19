package com.guigu.srb.core.service.impl;

import com.alibaba.excel.EasyExcel;
import com.guigu.srb.core.listerner.ExcelDictDTOListener;
import com.guigu.srb.core.pojo.dto.ExcelDictDTO;
import com.guigu.srb.core.service.DictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
@Slf4j
@Service
public class DictServiceImpl implements DictService {
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void importData(InputStream inputStream) {
        EasyExcel.read(inputStream,
                ExcelDictDTO.class,
                new ExcelDictDTOListener(baseMapper).sheet().doRead();
        log.info("importData finished");
    }
}
