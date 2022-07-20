package com.guigu.srb.core.service.impl;

import com.alibaba.excel.EasyExcel;
import com.guigu.srb.core.listerner.ExcelDictDTOListener;
import com.guigu.srb.core.pojo.dto.ExcelDictDTO;
import com.guigu.srb.core.service.DictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.InputStream;
@Slf4j
@Service
public class DictServiceImpl implements DictService {
    @Resource
    private RedisTemplate redisTemplate;
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void importData(InputStream inputStream) {
        EasyExcel.read(inputStream, ExcelDictDTO.class, new ExcelDictDTOListener()).sheet().doRead();
        log.info("Excel导入成功！");
    }
}
