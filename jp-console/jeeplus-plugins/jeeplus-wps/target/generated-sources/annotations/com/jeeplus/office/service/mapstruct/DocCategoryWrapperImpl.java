package com.jeeplus.office.service.mapstruct;

import com.jeeplus.office.domain.DocCategory;
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
public class DocCategoryWrapperImpl implements DocCategoryWrapper {

    @Override
    public DocCategory toEntity(DocCategoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DocCategory docCategory = new DocCategory();

        docCategory.setParentId( dtoParentId( dto ) );
        docCategory.setCreateBy( dtoCreateById( dto ) );
        docCategory.setUpdateBy( dtoUpdateById( dto ) );
        docCategory.setId( dto.getId() );
        docCategory.setCreateDate( dto.getCreateDate() );
        docCategory.setUpdateDate( dto.getUpdateDate() );
        docCategory.setDelFlag( dto.getDelFlag() );
        docCategory.setParentIds( dto.getParentIds() );
        docCategory.setName( dto.getName() );
        docCategory.setSort( dto.getSort() );
        docCategory.setChildren( toEntity( dto.getChildren() ) );
        docCategory.setRemarks( dto.getRemarks() );

        return docCategory;
    }

    @Override
    public DocCategoryDTO toDTO(DocCategory entity) {
        if ( entity == null ) {
            return null;
        }

        DocCategoryDTO docCategoryDTO = new DocCategoryDTO();

        docCategoryDTO.setParent( docCategoryToDocCategoryDTO( entity ) );
        docCategoryDTO.setCreateBy( docCategoryToUserDTO( entity ) );
        docCategoryDTO.setUpdateBy( docCategoryToUserDTO1( entity ) );
        docCategoryDTO.setId( entity.getId() );
        docCategoryDTO.setCreateDate( entity.getCreateDate() );
        docCategoryDTO.setUpdateDate( entity.getUpdateDate() );
        docCategoryDTO.setDelFlag( entity.getDelFlag() );
        docCategoryDTO.setChildren( toDTO( entity.getChildren() ) );
        docCategoryDTO.setParentIds( entity.getParentIds() );
        docCategoryDTO.setName( entity.getName() );
        docCategoryDTO.setSort( entity.getSort() );
        docCategoryDTO.setRemarks( entity.getRemarks() );

        return docCategoryDTO;
    }

    @Override
    public DocCategory copyEntity(DocCategory entity) {
        if ( entity == null ) {
            return null;
        }

        DocCategory docCategory = new DocCategory();

        docCategory.setId( entity.getId() );
        docCategory.setCreateDate( entity.getCreateDate() );
        docCategory.setCreateBy( entity.getCreateBy() );
        docCategory.setUpdateDate( entity.getUpdateDate() );
        docCategory.setUpdateBy( entity.getUpdateBy() );
        docCategory.setDelFlag( entity.getDelFlag() );
        docCategory.setParentId( entity.getParentId() );
        docCategory.setParentIds( entity.getParentIds() );
        docCategory.setName( entity.getName() );
        docCategory.setSort( entity.getSort() );
        List<DocCategory> list = entity.getChildren();
        if ( list != null ) {
            docCategory.setChildren( new ArrayList<DocCategory>( list ) );
        }
        docCategory.setRemarks( entity.getRemarks() );

        return docCategory;
    }

    @Override
    public DocCategoryDTO copyDTO(DocCategoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DocCategoryDTO docCategoryDTO = new DocCategoryDTO();

        docCategoryDTO.setId( dto.getId() );
        docCategoryDTO.setCreateDate( dto.getCreateDate() );
        docCategoryDTO.setCreateBy( dto.getCreateBy() );
        docCategoryDTO.setUpdateDate( dto.getUpdateDate() );
        docCategoryDTO.setUpdateBy( dto.getUpdateBy() );
        docCategoryDTO.setDelFlag( dto.getDelFlag() );
        docCategoryDTO.setParent( copyDTO( dto.getParent() ) );
        List<DocCategoryDTO> list = dto.getChildren();
        if ( list != null ) {
            docCategoryDTO.setChildren( new ArrayList<DocCategoryDTO>( list ) );
        }
        docCategoryDTO.setParentIds( dto.getParentIds() );
        docCategoryDTO.setName( dto.getName() );
        docCategoryDTO.setSort( dto.getSort() );
        docCategoryDTO.setRemarks( dto.getRemarks() );
        List<DocTemplateDTO> list1 = dto.getDocTemplateDTOList();
        if ( list1 != null ) {
            docCategoryDTO.setDocTemplateDTOList( new ArrayList<DocTemplateDTO>( list1 ) );
        }

        return docCategoryDTO;
    }

    @Override
    public List<DocCategory> toEntity(List<DocCategoryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DocCategory> list = new ArrayList<DocCategory>( dtoList.size() );
        for ( DocCategoryDTO docCategoryDTO : dtoList ) {
            list.add( toEntity( docCategoryDTO ) );
        }

        return list;
    }

    @Override
    public List<DocCategoryDTO> toDTO(List<DocCategory> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DocCategoryDTO> list = new ArrayList<DocCategoryDTO>( entityList.size() );
        for ( DocCategory docCategory : entityList ) {
            list.add( toDTO( docCategory ) );
        }

        return list;
    }

    private String dtoParentId(DocCategoryDTO docCategoryDTO) {
        if ( docCategoryDTO == null ) {
            return null;
        }
        DocCategoryDTO parent = docCategoryDTO.getParent();
        if ( parent == null ) {
            return null;
        }
        String id = parent.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoCreateById(DocCategoryDTO docCategoryDTO) {
        if ( docCategoryDTO == null ) {
            return null;
        }
        UserDTO createBy = docCategoryDTO.getCreateBy();
        if ( createBy == null ) {
            return null;
        }
        String id = createBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoUpdateById(DocCategoryDTO docCategoryDTO) {
        if ( docCategoryDTO == null ) {
            return null;
        }
        UserDTO updateBy = docCategoryDTO.getUpdateBy();
        if ( updateBy == null ) {
            return null;
        }
        String id = updateBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected DocCategoryDTO docCategoryToDocCategoryDTO(DocCategory docCategory) {
        if ( docCategory == null ) {
            return null;
        }

        DocCategoryDTO docCategoryDTO = new DocCategoryDTO();

        docCategoryDTO.setId( docCategory.getParentId() );

        return docCategoryDTO;
    }

    protected UserDTO docCategoryToUserDTO(DocCategory docCategory) {
        if ( docCategory == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( docCategory.getCreateBy() );

        return userDTO;
    }

    protected UserDTO docCategoryToUserDTO1(DocCategory docCategory) {
        if ( docCategory == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( docCategory.getUpdateBy() );

        return userDTO;
    }
}
