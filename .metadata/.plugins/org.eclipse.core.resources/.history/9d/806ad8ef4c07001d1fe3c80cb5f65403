package com.wclass.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wmember.model.WFavoriteDAO;
import com.wmember.model.WFavoriteDTO;

/**
 * Servlet implementation class WFavoriteInsert
 */
@WebServlet("/class/favoriteInsert")
public class WFavoriteInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WFavoriteInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd=request.getRequestDispatcher("courseDetail.jsp");
        rd.forward(request, response);
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        WFavoriteDTO favorite=new WFavoriteDTO();
        favorite.setClassname(request.getParameter("classname"));
        favorite.setClassnum(Integer.parseInt(request.getParameter("classnum")));
        favorite.setUserid(request.getParameter("userid"));
        WFavoriteDAO dao=WFavoriteDAO.getInstance();
        int flag=dao.favoriteInsert(favorite);
        PrintWriter out = response.getWriter();
        out.println(flag);
    }
}
