package com.jeeplus.sys.service.mapstruct;

import com.jeeplus.sys.domain.Menu;
import com.jeeplus.sys.service.dto.DataRuleDTO;
import com.jeeplus.sys.service.dto.MenuDTO;
import com.jeeplus.sys.service.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T08:14:30+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
@Component
public class MenuWrapperImpl implements MenuWrapper {

    @Override
    public Menu toEntity(MenuDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Menu menu = new Menu();

        menu.setParentId( dtoParentId( dto ) );
        menu.setCreateBy( dtoCreateById( dto ) );
        menu.setUpdateBy( dtoUpdateById( dto ) );
        menu.setId( dto.getId() );
        menu.setCreateDate( dto.getCreateDate() );
        menu.setUpdateDate( dto.getUpdateDate() );
        menu.setDelFlag( dto.getDelFlag() );
        menu.setParentIds( dto.getParentIds() );
        menu.setName( dto.getName() );
        menu.setSort( dto.getSort() );
        menu.setChildren( toEntity( dto.getChildren() ) );
        menu.setHref( dto.getHref() );
        menu.setTarget( dto.getTarget() );
        menu.setIcon( dto.getIcon() );
        menu.setIsShow( dto.getIsShow() );
        menu.setType( dto.getType() );
        menu.setPermission( dto.getPermission() );
        menu.setAffix( dto.getAffix() );
        menu.setRemarks( dto.getRemarks() );

        return menu;
    }

    @Override
    public MenuDTO toDTO(Menu entity) {
        if ( entity == null ) {
            return null;
        }

        MenuDTO menuDTO = new MenuDTO();

        menuDTO.setParent( menuToMenuDTO( entity ) );
        menuDTO.setCreateBy( menuToUserDTO( entity ) );
        menuDTO.setUpdateBy( menuToUserDTO1( entity ) );
        menuDTO.setId( entity.getId() );
        menuDTO.setCreateDate( entity.getCreateDate() );
        menuDTO.setUpdateDate( entity.getUpdateDate() );
        menuDTO.setDelFlag( entity.getDelFlag() );
        menuDTO.setChildren( toDTO( entity.getChildren() ) );
        menuDTO.setParentIds( entity.getParentIds() );
        menuDTO.setName( entity.getName() );
        menuDTO.setSort( entity.getSort() );
        menuDTO.setHref( entity.getHref() );
        menuDTO.setTarget( entity.getTarget() );
        menuDTO.setIcon( entity.getIcon() );
        menuDTO.setIsShow( entity.getIsShow() );
        menuDTO.setType( entity.getType() );
        menuDTO.setPermission( entity.getPermission() );
        menuDTO.setAffix( entity.getAffix() );
        menuDTO.setRemarks( entity.getRemarks() );

        return menuDTO;
    }

    @Override
    public Menu copyEntity(Menu entity) {
        if ( entity == null ) {
            return null;
        }

        Menu menu = new Menu();

        menu.setId( entity.getId() );
        menu.setCreateDate( entity.getCreateDate() );
        menu.setCreateBy( entity.getCreateBy() );
        menu.setUpdateDate( entity.getUpdateDate() );
        menu.setUpdateBy( entity.getUpdateBy() );
        menu.setDelFlag( entity.getDelFlag() );
        menu.setParentId( entity.getParentId() );
        menu.setParentIds( entity.getParentIds() );
        menu.setName( entity.getName() );
        menu.setSort( entity.getSort() );
        List<Menu> list = entity.getChildren();
        if ( list != null ) {
            menu.setChildren( new ArrayList<Menu>( list ) );
        }
        menu.setHref( entity.getHref() );
        menu.setTarget( entity.getTarget() );
        menu.setIcon( entity.getIcon() );
        menu.setIsShow( entity.getIsShow() );
        menu.setType( entity.getType() );
        menu.setPermission( entity.getPermission() );
        menu.setAffix( entity.getAffix() );
        menu.setRemarks( entity.getRemarks() );

        return menu;
    }

    @Override
    public MenuDTO copyDTO(MenuDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MenuDTO menuDTO = new MenuDTO();

        menuDTO.setId( dto.getId() );
        menuDTO.setCreateDate( dto.getCreateDate() );
        menuDTO.setCreateBy( dto.getCreateBy() );
        menuDTO.setUpdateDate( dto.getUpdateDate() );
        menuDTO.setUpdateBy( dto.getUpdateBy() );
        menuDTO.setDelFlag( dto.getDelFlag() );
        menuDTO.setParent( copyDTO( dto.getParent() ) );
        List<MenuDTO> list = dto.getChildren();
        if ( list != null ) {
            menuDTO.setChildren( new ArrayList<MenuDTO>( list ) );
        }
        menuDTO.setParentIds( dto.getParentIds() );
        menuDTO.setName( dto.getName() );
        menuDTO.setSort( dto.getSort() );
        menuDTO.setHref( dto.getHref() );
        menuDTO.setTarget( dto.getTarget() );
        menuDTO.setIcon( dto.getIcon() );
        menuDTO.setIsShow( dto.getIsShow() );
        menuDTO.setType( dto.getType() );
        menuDTO.setPermission( dto.getPermission() );
        List<DataRuleDTO> list1 = dto.getDataRuleDTOList();
        if ( list1 != null ) {
            menuDTO.setDataRuleDTOList( new ArrayList<DataRuleDTO>( list1 ) );
        }
        menuDTO.setUserId( dto.getUserId() );
        menuDTO.setAffix( dto.getAffix() );
        menuDTO.setRemarks( dto.getRemarks() );

        return menuDTO;
    }

    @Override
    public List<Menu> toEntity(List<MenuDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Menu> list = new ArrayList<Menu>( dtoList.size() );
        for ( MenuDTO menuDTO : dtoList ) {
            list.add( toEntity( menuDTO ) );
        }

        return list;
    }

    @Override
    public List<MenuDTO> toDTO(List<Menu> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MenuDTO> list = new ArrayList<MenuDTO>( entityList.size() );
        for ( Menu menu : entityList ) {
            list.add( toDTO( menu ) );
        }

        return list;
    }

    private String dtoParentId(MenuDTO menuDTO) {
        if ( menuDTO == null ) {
            return null;
        }
        MenuDTO parent = menuDTO.getParent();
        if ( parent == null ) {
            return null;
        }
        String id = parent.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoCreateById(MenuDTO menuDTO) {
        if ( menuDTO == null ) {
            return null;
        }
        UserDTO createBy = menuDTO.getCreateBy();
        if ( createBy == null ) {
            return null;
        }
        String id = createBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtoUpdateById(MenuDTO menuDTO) {
        if ( menuDTO == null ) {
            return null;
        }
        UserDTO updateBy = menuDTO.getUpdateBy();
        if ( updateBy == null ) {
            return null;
        }
        String id = updateBy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected MenuDTO menuToMenuDTO(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        MenuDTO menuDTO = new MenuDTO();

        menuDTO.setId( menu.getParentId() );

        return menuDTO;
    }

    protected UserDTO menuToUserDTO(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( menu.getCreateBy() );

        return userDTO;
    }

    protected UserDTO menuToUserDTO1(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( menu.getUpdateBy() );

        return userDTO;
    }
}
