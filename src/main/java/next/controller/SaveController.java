package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.dao.QuestionDao;
import next.model.Question;
import core.mvc.Controller;

public class SaveController implements Controller {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		QuestionDao questionDao = new QuestionDao();
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		Question newQuestion = new Question(writer, title, contents);
		questionDao.insert(newQuestion);
		
		return "redirect:/list.next";
	}
}
