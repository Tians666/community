package life.majiang.community.controller.houtai;

import life.majiang.community.dao.MenuDao;
import life.majiang.community.entity.Menu;
import life.majiang.community.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/houtai/menu")
public class HouTai_Menu_Controller {

    @Resource
    private MenuService menuService;
    @Resource
    private MenuDao menuDao;


    @RequestMapping("/manage")
    public ModelAndView manage(@RequestParam(value = "pId",required = false) Integer pId) throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.addObject("pageTitle", "菜单管理");
        mav.addObject("title", "菜单管理");
        mav.setViewName("/admin/page/menu/menu_manage");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "pId",required = false) Integer pId) throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.addObject("btn_text", "添加");
        mav.addObject("save_url", "/admin/menu/add");
        mav.setViewName("/admin/page/menu/add_update");
        return mav;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(@RequestParam(value = "id",required = false) Integer id) throws Exception{
        ModelAndView mav = new ModelAndView();
        Menu menu = menuDao.findId(id);
        mav.addObject("menu", menu);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/admin/menu/update?id=" + id);
        mav.addObject("pId",menu.getpId());
        mav.setViewName("/admin/page/menu/add_update");
        return mav;
    }




}
