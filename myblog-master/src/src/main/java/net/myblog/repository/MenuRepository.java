package net.myblog.repository;

import java.util.List;
import java.util.Set;

import net.myblog.entity.Menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MenuRepository extends JpaRepository<Menu, Integer>{

	/**
	 * 获取所有的上级菜单，并按菜单序号排序
	 * @return
	 */
	@Query("from Menu m where m.parentId=0 order by m.menuOrder asc")
	public List<Menu> findAllParentMenu();
	
	/**
	 * 根据上级菜单Id获取二级菜单，并按菜单序号排序
	 * @param id
	 * @return
	 */
	@Query("from Menu m where m.parentId=:id order by m.menuOrder asc")
	public List<Menu> findSubMenuByParentId(@Param("id")int id);
}
