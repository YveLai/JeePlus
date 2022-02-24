package com.jeeplus.datav.service.mapstruct;

import com.jeeplus.datav.domain.DataScreenCategory;
import com.jeeplus.datav.service.dto.DataScreenCategoryDTO;
import com.jeeplus.sys.service.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T08:14:59+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
@Component
public class DataScreenCategoryWrapperImpl implements DataScreenCategoryWrapper {

    @Override
    public DataScreenCategory toEntity(DataScreenCategoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DataScreenCategory dataScreenCategory = new DataScreenCategory();

        dataScreenCategory.setParentId( dtoParentId( dto ) );
        dataScreenCategory.setCreateBy( dtoCreateById( dto ) );
        dataScreenCategory.setUpdateBy( dtoUpdateById( dto ) );
        dataScreenCategory.setId( dto.getId() );
        dataScreenCategory.setCreateDate( dto.getCreateDate() );
        dataScreenCategory.setUpdateDate( dto.getUpdateDate() );
        dataScreenCategory.setDelFlag( dto.getDelFlag() );
        dataScreenCategory.setParentIds( dto.getParentIds() );
        dataScreenCategory.setName( dto.getName() );
        dataScreenCategory.setSort( dto.getSort() );
        dataScreenCategory.setChildren( toEntity( dto.getChildren() ) );
        dataScreenCategory.setRemarks( dto.getRemarks() );

        return dataScreenCategory;
    }

    @Override
    public DataScreenCategoryDTO toDTO(DataScreenCategory entity) {
        if ( entity == null ) {
            return null;
        }

        DataScreenCategoryDTO dataScreenCategoryDTO = new DataScreenCategoryDTO();

        dataScreenCategoryDTO.setParent( dataScreenCategoryToDataScreenCategoryDTO( entity ) );
        dataScreenCategoryDTO.setCreateBy( dataScreenCategoryToUserDTO( entity ) );
        dataScreenCategoryDTO.setUpdateBy( dataScreenCategoryToUserDTO1( entity ) );
        dataScreenCategoryDTO.setId( entity.getId() );
        dataScreenCategoryDTO.setCreateDate( entity.getCreateDate() );
        dataScreenCategoryDTO.setUpdateDate( entity.getUpdateDate() );
        dataScreenCategoryDTO.setDelFlag( entity.getDelFlag() );
        dataScreenCategoryDTO.setChildren( toDTO( entity.getChildren() ) );
        dataScreenCategoryDTO.setParentIds( entity.getParentIds() );
        dataScreenCategoryDTO.setSort( entity.getSort() );
        dataScreenCategoryDTO.setName( entity.getName() );
        dataScreenCategoryDTO.setRemarks( entity.getRemarks() );

        return dataScreenCategoryDTO;
    }

    @Override
    public DataScreenCategory copyEntity(DataScreenCategory entity) {
        if ( entity == null ) {
            return null;
        }

        DataScreenCategory dataScreenCategory = new DataScreenCategory();

        dataScreenCategory.setId( entity.getId() );
        dataScreenCategory.setCreateDate( entity.getCreateDate() );
        dataScreenCategory.setCreateBy( entity.getCreateBy() );
        dataScreenCategory.setUpdateDate( entity.getUpdateDate() );
        dataScreenCategory.setUpdateBy( entity.getUpdateBy() );
        dataScreenCategory.setDelFlag( entity.getDelFlag() );
        dataScreenCategory.setParentId( entity.getParentId() );
        dataScreenCategory.setParentIds( entity.getParentIds() );
        dataScreenCategory.setName( entity.getName() );
        dataScreenCategory.setSort( entity.getSort() );
        List<DataScreenCategory> list = entity.getChildren();
        if ( list != null ) {
            dataScreenCategory.setChildren( new ArrayList<DataScreenCategory>( list ) );
        }
        dataScreenCategory.setRemarks( entity.getRemarks() );

        return dataScreenCategory;
    }

    @Override
    public DataScreenCategoryDTO copyDTO(DataScreenCategoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DataScreenCategoryDTO dataScreenCategoryDTO = new DataScreenCategoryDTO();

        dataScreenCategoryDTO.setId( dto.getId() );
        dataScreenCategoryDTO.setCreateDate( dto.getCreateDate() );
        dataScreenCategoryDTO.setCreateBy( dto.getCreateBy() );
        dataScreenCategoryDTO.setUpdateDate( dto.getUpdateDate() );
        dataScreenCategoryDTO.setUpdateBy( dto.getUpdateBy() );
        dataScreenCategoryDTO.setDelFlag( dto.getDelFlag() );
        dataScreenCategoryDTO.setParent( copyDTO( dto.getParent() ) );
        List<DataScreenCategoryDTO> list = dto.getChildren();
        if ( list != null ) {
            dataScreenCategoryDTO.setChildren( new ArrayList<DataScreenCategoryDTO>( list ) );
        }
        dataScreenCategoryDTO.setParentIds( dto.getParentIds() );
        dataScreenCategoryDTO.setSort( dto.getSort() );
        dataScreenCategoryDTO.setName( dto.getName() );
        dataScreenCategoryDTO.setRemarks( dto.getRemarks() );

        return dataScreenCategoryDTO;
    }

    @Override
    public List<DataScreenCategory> toEntity(List<DataScreenCategoryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DataScreenCategory> list = new ArrayList<DataScreenCategory>( dtoList.size() );
        for ( DataScreenCategoryDTO dataScreenCategoryDTO : dtoList ) {
            list.add( toEntity( dataScreenCategoryDTO ) );
        }

        return list;
    }

    @Override
    public List<DataScreenCategoryDTO> toDTO(List<DataScreenCategory> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DataScreenCategoryDTO> list = new ArrayList<DataScreenCategoryDTO>( entityList.size() );
        for ( DataScreenCategory dataScreenCategory : entityList ) {
            list.add( toDTO( dataScreenCategory ) );
        }

        return list;
    }

    private String dtoParentId(DataScreenCategoryDTO dataScreenCategoryDTO) {
        if ( dataScreenCategoryDTO == null ) {
            return null;
        }
        DataScreenCategoryDTO parent = dataScreenCategoryDTO.getParent();
        if ( parent == null ) {
            return null;
        }
        String id = parent.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoCreateById(DataScreenCategoryDTO dataScreenCategoryDTO) {
        if ( dataScreenCategoryDTO == null ) {
            return null;
        }
        UserDTO createBy = dataScreenCategoryDTO.getCreateBy();
        if ( createBy == null ) {
            return null;
        }
        String id = createBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoUpdateById(DataScreenCategoryDTO dataScreenCategoryDTO) {
        if ( dataScreenCategoryDTO == null ) {
            return null;
        }
        UserDTO updateBy = dataScreenCategoryDTO.getUpdateBy();
        if ( updateBy == null ) {
            return null;
        }
        String id = updateBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected DataScreenCategoryDTO dataScreenCategoryToDataScreenCategoryDTO(DataScreenCategory dataScreenCategory) {
        if ( dataScreenCategory == null ) {
            return null;
        }

        DataScreenCategoryDTO dataScreenCategoryDTO = new DataScreenCategoryDTO();

        dataScreenCategoryDTO.setId( dataScreenCategory.getParentId() );

        return dataScreenCategoryDTO;
    }

    protected UserDTO dataScreenCategoryToUserDTO(DataScreenCategory dataScreenCategory) {
        if ( dataScreenCategory == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( dataScreenCategory.getCreateBy() );

        return userDTO;
    }

    protected UserDTO dataScreenCategoryToUserDTO1(DataScreenCategory dataScreenCategory) {
        if ( dataScreenCategory == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( dataScreenCategory.getUpdateBy() );

        return userDTO;
    }
}
