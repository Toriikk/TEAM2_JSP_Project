package com.wclass.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.wmember.model.WFavoriteDAO;
import com.wmember.model.WFavoriteDTO;

/**
 * Servlet implementation class WFavoriteList
 */
@WebServlet("/member/favoriteList")
public class WFavoriteList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WFavoriteList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userid=request.getParameter("userid");
		WFavoriteDAO dao=WFavoriteDAO.getInstance();
		ArrayList<WFavoriteDTO> arr= dao.favoriteList(userid);
		
		JSONObject mainObj=new JSONObject();
		JSONArray jarr=new JSONArray();
		
		for(WFavoriteDTO cd:arr) {
			JSONObject obj=new JSONObject();
			obj.put("userid", cd.getUserid());
			obj.put("favoritenum", cd.getfavoritenum());
			obj.put("classnum", cd.getClassnum());
			obj.put("classname", cd.getClassname());
			jarr.add(obj);
		}
		mainObj.put("carr", jarr);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println(mainObj.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
