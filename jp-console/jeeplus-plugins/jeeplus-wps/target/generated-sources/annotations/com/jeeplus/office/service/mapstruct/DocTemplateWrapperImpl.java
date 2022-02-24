package com.jeeplus.office.service.mapstruct;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeeplus.office.domain.DocTemplate;
import com.jeeplus.office.service.dto.DocCategoryDTO;
import com.jeeplus.office.service.dto.DocTemplateDTO;
import com.jeeplus.sys.service.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T08:14:35+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
@Component
public class DocTemplateWrapperImpl implements DocTemplateWrapper {

    @Override
    public List<DocTemplate> toEntity(List<DocTemplateDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DocTemplate> list = new ArrayList<DocTemplate>( dtoList.size() );
        for ( DocTemplateDTO docTemplateDTO : dtoList ) {
            list.add( toEntity( docTemplateDTO ) );
        }

        return list;
    }

    @Override
    public List<DocTemplateDTO> toDTO(List<DocTemplate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DocTemplateDTO> list = new ArrayList<DocTemplateDTO>( entityList.size() );
        for ( DocTemplate docTemplate : entityList ) {
            list.add( toDTO( docTemplate ) );
        }

        return list;
    }

    @Override
    public Page<DocTemplate> toEntity(Page<DocTemplateDTO> page) {
        if ( page == null ) {
            return null;
        }

        Page<DocTemplate> page1 = new Page<DocTemplate>();

        page1.setPages( page.getPages() );
        page1.setRecords( toEntity( page.getRecords() ) );
        page1.setTotal( page.getTotal() );
        page1.setSize( page.getSize() );
        page1.setCurrent( page.getCurrent() );
        page1.setSearchCount( page.isSearchCount() );
        page1.setOptimizeCountSql( page.isOptimizeCountSql() );
        page1.setHitCount( page.isHitCount() );
        List<OrderItem> list1 = page.getOrders();
        if ( list1 != null ) {
            page1.setOrders( new ArrayList<OrderItem>( list1 ) );
        }
        page1.setCountId( page.getCountId() );
        page1.setMaxLimit( page.getMaxLimit() );

        return page1;
    }

    @Override
    public Page<DocTemplateDTO> toDTO(Page<DocTemplate> page) {
        if ( page == null ) {
            return null;
        }

        Page<DocTemplateDTO> page1 = new Page<DocTemplateDTO>();

        page1.setPages( page.getPages() );
        page1.setRecords( toDTO( page.getRecords() ) );
        page1.setTotal( page.getTotal() );
        page1.setSize( page.getSize() );
        page1.setCurrent( page.getCurrent() );
        page1.setSearchCount( page.isSearchCount() );
        page1.setOptimizeCountSql( page.isOptimizeCountSql() );
        page1.setHitCount( page.isHitCount() );
        List<OrderItem> list1 = page.getOrders();
        if ( list1 != null ) {
            page1.setOrders( new ArrayList<OrderItem>( list1 ) );
        }
        page1.setCountId( page.getCountId() );
        page1.setMaxLimit( page.getMaxLimit() );

        return page1;
    }

    @Override
    public DocTemplate toEntity(DocTemplateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DocTemplate docTemplate = new DocTemplate();

        docTemplate.setCategoryId( dtoDocCategoryDTOId( dto ) );
        docTemplate.setCreateBy( dtoCreateById( dto ) );
        docTemplate.setUpdateBy( dtoUpdateById( dto ) );
        docTemplate.setId( dto.getId() );
        docTemplate.setCreateDate( dto.getCreateDate() );
        docTemplate.setUpdateDate( dto.getUpdateDate() );
        docTemplate.setDelFlag( dto.getDelFlag() );
        docTemplate.setName( dto.getName() );
        docTemplate.setPath( dto.getPath() );
        docTemplate.setVersion( dto.getVersion() );
        docTemplate.setRemarks( dto.getRemarks() );

        return docTemplate;
    }

    @Override
    public DocTemplateDTO toDTO(DocTemplate entity) {
        if ( entity == null ) {
            return null;
        }

        DocTemplateDTO docTemplateDTO = new DocTemplateDTO();

        docTemplateDTO.setDocCategoryDTO( docTemplateToDocCategoryDTO( entity ) );
        docTemplateDTO.setCreateBy( docTemplateToUserDTO( entity ) );
        docTemplateDTO.setUpdateBy( docTemplateToUserDTO1( entity ) );
        docTemplateDTO.setId( entity.getId() );
        docTemplateDTO.setCreateDate( entity.getCreateDate() );
        docTemplateDTO.setUpdateDate( entity.getUpdateDate() );
        docTemplateDTO.setDelFlag( entity.getDelFlag() );
        docTemplateDTO.setName( entity.getName() );
        docTemplateDTO.setPath( entity.getPath() );
        docTemplateDTO.setVersion( entity.getVersion() );
        docTemplateDTO.setRemarks( entity.getRemarks() );

        return docTemplateDTO;
    }

    private String dtoDocCategoryDTOId(DocTemplateDTO docTemplateDTO) {
        if ( docTemplateDTO == null ) {
            return null;
        }
        DocCategoryDTO docCategoryDTO = docTemplateDTO.getDocCategoryDTO();
        if ( docCategoryDTO == null ) {
            return null;
        }
        String id = docCategoryDTO.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoCreateById(DocTemplateDTO docTemplateDTO) {
        if ( docTemplateDTO == null ) {
            return null;
        }
        UserDTO createBy = docTemplateDTO.getCreateBy();
        if ( createBy == null ) {
            return null;
        }
        String id = createBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoUpdateById(DocTemplateDTO docTemplateDTO) {
        if ( docTemplateDTO == null ) {
            return null;
        }
        UserDTO updateBy = docTemplateDTO.getUpdateBy();
        if ( updateBy == null ) {
            return null;
        }
        String id = updateBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected DocCategoryDTO docTemplateToDocCategoryDTO(DocTemplate docTemplate) {
        if ( docTemplate == null ) {
            return null;
        }

        DocCategoryDTO docCategoryDTO = new DocCategoryDTO();

        docCategoryDTO.setId( docTemplate.getCategoryId() );

        return docCategoryDTO;
    }

    protected UserDTO docTemplateToUserDTO(DocTemplate docTemplate) {
        if ( docTemplate == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( docTemplate.getCreateBy() );

        return userDTO;
    }

    protected UserDTO docTemplateToUserDTO1(DocTemplate docTemplate) {
        if ( docTemplate == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( docTemplate.getUpdateBy() );

        return userDTO;
    }
}
