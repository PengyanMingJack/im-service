package com.imovie.modules.television.service;

import com.imovie.modules.television.domain.Television;
import com.imovie.modules.television.service.dto.TelevisionDto;
import com.imovie.modules.television.service.dto.TelevisionQueryCriteria;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
* @author admin
* @date 2020-03-30
*/
public interface TelevisionService {

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(TelevisionQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<TelevisionDto>
    */
    List<TelevisionDto> queryAll(TelevisionQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id ID
     * @return TelevisionDto
     */
    TelevisionDto findById(Long id);

    /**
    * 创建
    * @param resources /
    * @return TelevisionDto
    */
    TelevisionDto create(Television resources);

    /**
    * 编辑
    * @param resources /
    */
    void update(Television resources);

    void update(TelevisionDto resources);

    /**
    * 多选删除
    * @param ids /
    */
    void deleteAll(Long[] ids);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<TelevisionDto> all, HttpServletResponse response) throws IOException;
}