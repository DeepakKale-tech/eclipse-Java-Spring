package test;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;


public class CubeTag extends SimpleTagSupport {

	private int cube;

	public void setCube(int cube) {
		this.cube = cube;
	}
	
	public void doTag() throws JspException,IOException
	{
		JspWriter jw = getJspContext().getOut();
		jw.println("Cube of "+cube+" : "+(cube*cube*cube));
	}
}
