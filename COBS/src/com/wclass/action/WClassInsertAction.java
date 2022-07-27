package com.wclass.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.wmember.model.WClassDAO;
import com.wmember.model.WClassDTO;
import com.wmember.model.WMemberDAO;
import com.wmember.model.WMemberDTO;

/**
 * Servlet implementation class WClassInsertAction
 */
@WebServlet("/class/ClassInsert")
public class WClassInsertAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WClassInsertAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("ClassInsert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		WClassDAO dao=WClassDAO.getInstance();
		int uploadFileSizeLimit=5*1024*1024;
		String encType="UTF-8";
		String savePath="upload";
		ServletContext context=getServletContext();
		String uploadFilePath=context.getRealPath(savePath);
		
		//multipart/form 방식은 request.getParameter로 받아올 수 없음
		MultipartRequest multi=new MultipartRequest(
				request, //request객체
				uploadFilePath, //서버상의 실제 디렉토리
				uploadFileSizeLimit, //최대 업로드 파일 크기
				encType, //인코딩 방법
				new DefaultFileRenamePolicy()); //동일 파일 새이름 부여
		
		//업로드된 파일이름 구하기
		String fileName=multi.getFilesystemName("uploadFile");
		
		if(fileName==null) { //파일 업로드 안됨
			System.out.println("파일 업로드 되지 않았음");
		}
		
		WClassDTO wclass=new WClassDTO();
		wclass.setUploadFile(fileName);  // 객체에 각 정보를 저장
		wclass.setClassname(multi.getParameter("classname")); //강의명(classinsert.jsp에서 입력한 것들)
		wclass.setClevel(multi.getParameter("clevel"));       //강의수준
		wclass.setContent(multi.getParameter("content"));
		wclass.setTopic(multi.getParameter("topic"));
		wclass.setVideourl(multi.getParameter("videourl"));
		wclass.setStu_num(1);
		wclass.setStu_regdate(" ");
		
		
//		classname, stu_num, stu_regdate, topic, content, "
//				+ " clevel, uploadfile
//		
		int flag=dao.classInsert(wclass); // 강의등록
		if(flag==1) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('강의가 등록되었습니다');");
			out.println("history.back(-1);");
			out.println("</script>");
		}
	}

}
