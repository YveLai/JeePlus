package com.jeeplus.datav.service.mapstruct;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeeplus.datav.domain.DataMap;
import com.jeeplus.datav.service.dto.DataMapDTO;
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
public class DataMapWrapperImpl implements DataMapWrapper {

    @Override
    public DataMap toEntity(DataMapDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DataMap dataMap = new DataMap();

        dataMap.setCreateBy( dtoCreateById( dto ) );
        dataMap.setUpdateBy( dtoUpdateById( dto ) );
        dataMap.setId( dto.getId() );
        dataMap.setCreateDate( dto.getCreateDate() );
        dataMap.setUpdateDate( dto.getUpdateDate() );
        dataMap.setDelFlag( dto.getDelFlag() );
        dataMap.setName( dto.getName() );
        dataMap.setData( dto.getData() );
        dataMap.setRemarks( dto.getRemarks() );

        return dataMap;
    }

    @Override
    public DataMapDTO toDTO(DataMap entity) {
        if ( entity == null ) {
            return null;
        }

        DataMapDTO dataMapDTO = new DataMapDTO();

        dataMapDTO.setCreateBy( dataMapToUserDTO( entity ) );
        dataMapDTO.setUpdateBy( dataMapToUserDTO1( entity ) );
        dataMapDTO.setId( entity.getId() );
        dataMapDTO.setCreateDate( entity.getCreateDate() );
        dataMapDTO.setUpdateDate( entity.getUpdateDate() );
        dataMapDTO.setDelFlag( entity.getDelFlag() );
        dataMapDTO.setName( entity.getName() );
        dataMapDTO.setData( entity.getData() );
        dataMapDTO.setRemarks( entity.getRemarks() );

        return dataMapDTO;
    }

    @Override
    public List<DataMap> toEntity(List<DataMapDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DataMap> list = new ArrayList<DataMap>( dtoList.size() );
        for ( DataMapDTO dataMapDTO : dtoList ) {
            list.add( toEntity( dataMapDTO ) );
        }

        return list;
    }

    @Override
    public List<DataMapDTO> toDTO(List<DataMap> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DataMapDTO> list = new ArrayList<DataMapDTO>( entityList.size() );
        for ( DataMap dataMap : entityList ) {
            list.add( toDTO( dataMap ) );
        }

        return list;
    }

    @Override
    public Page<DataMap> toEntity(Page<DataMapDTO> page) {
        if ( page == null ) {
            return null;
        }

        Page<DataMap> page1 = new Page<DataMap>();

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
    public Page<DataMapDTO> toDTO(Page<DataMap> page) {
        if ( page == null ) {
            return null;
        }

        Page<DataMapDTO> page1 = new Page<DataMapDTO>();

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

    private String dtoCreateById(DataMapDTO dataMapDTO) {
        if ( dataMapDTO == null ) {
            return null;
        }
        UserDTO createBy = dataMapDTO.getCreateBy();
        if ( createBy == null ) {
            return null;
        }
        String id = createBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoUpdateById(DataMapDTO dataMapDTO) {
        if ( dataMapDTO == null ) {
            return null;
        }
        UserDTO updateBy = dataMapDTO.getUpdateBy();
        if ( updateBy == null ) {
            return null;
        }
        String id = updateBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UserDTO dataMapToUserDTO(DataMap dataMap) {
        if ( dataMap == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( dataMap.getCreateBy() );

        return userDTO;
    }

    protected UserDTO dataMapToUserDTO1(DataMap dataMap) {
        if ( dataMap == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( dataMap.getUpdateBy() );

        return userDTO;
    }
}
