package com.jeeplus.notify.service.mapstruct;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeeplus.notify.domain.Notify;
import com.jeeplus.notify.service.dto.NotifyDTO;
import com.jeeplus.sys.service.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T08:14:39+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
@Component
public class NotifyWrapperImpl implements NotifyWrapper {

    @Override
    public Notify toEntity(NotifyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Notify notify = new Notify();

        notify.setCreateBy( dtoCreateById( dto ) );
        notify.setUpdateBy( dtoUpdateById( dto ) );
        notify.setId( dto.getId() );
        notify.setCreateDate( dto.getCreateDate() );
        notify.setUpdateDate( dto.getUpdateDate() );
        notify.setDelFlag( dto.getDelFlag() );
        notify.setType( dto.getType() );
        notify.setTitle( dto.getTitle() );
        notify.setContent( dto.getContent() );
        notify.setFiles( dto.getFiles() );
        notify.setStatus( dto.getStatus() );

        return notify;
    }

    @Override
    public NotifyDTO toDTO(Notify entity) {
        if ( entity == null ) {
            return null;
        }

        NotifyDTO notifyDTO = new NotifyDTO();

        notifyDTO.setCreateBy( notifyToUserDTO( entity ) );
        notifyDTO.setUpdateBy( notifyToUserDTO1( entity ) );
        notifyDTO.setId( entity.getId() );
        notifyDTO.setCreateDate( entity.getCreateDate() );
        notifyDTO.setUpdateDate( entity.getUpdateDate() );
        notifyDTO.setDelFlag( entity.getDelFlag() );
        notifyDTO.setType( entity.getType() );
        notifyDTO.setTitle( entity.getTitle() );
        notifyDTO.setContent( entity.getContent() );
        notifyDTO.setFiles( entity.getFiles() );
        notifyDTO.setStatus( entity.getStatus() );

        return notifyDTO;
    }

    @Override
    public List<Notify> toEntity(List<NotifyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Notify> list = new ArrayList<Notify>( dtoList.size() );
        for ( NotifyDTO notifyDTO : dtoList ) {
            list.add( toEntity( notifyDTO ) );
        }

        return list;
    }

    @Override
    public List<NotifyDTO> toDTO(List<Notify> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<NotifyDTO> list = new ArrayList<NotifyDTO>( entityList.size() );
        for ( Notify notify : entityList ) {
            list.add( toDTO( notify ) );
        }

        return list;
    }

    @Override
    public Page<Notify> toEntity(Page<NotifyDTO> page) {
        if ( page == null ) {
            return null;
        }

        Page<Notify> page1 = new Page<Notify>();

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
    public Page<NotifyDTO> toDTO(Page<Notify> page) {
        if ( page == null ) {
            return null;
        }

        Page<NotifyDTO> page1 = new Page<NotifyDTO>();

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

    private String dtoCreateById(NotifyDTO notifyDTO) {
        if ( notifyDTO == null ) {
            return null;
        }
        UserDTO createBy = notifyDTO.getCreateBy();
        if ( createBy == null ) {
            return null;
        }
        String id = createBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoUpdateById(NotifyDTO notifyDTO) {
        if ( notifyDTO == null ) {
            return null;
        }
        UserDTO updateBy = notifyDTO.getUpdateBy();
        if ( updateBy == null ) {
            return null;
        }
        String id = updateBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UserDTO notifyToUserDTO(Notify notify) {
        if ( notify == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( notify.getCreateBy() );

        return userDTO;
    }

    protected UserDTO notifyToUserDTO1(Notify notify) {
        if ( notify == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( notify.getUpdateBy() );

        return userDTO;
    }
}
