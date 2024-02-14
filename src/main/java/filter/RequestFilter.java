package filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/login.html")
public class RequestFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws ServletException, IOException {

    ChangeEmailRequestWrapper wrapper = new ChangeEmailRequestWrapper((HttpServletRequest) servletRequest);

//    System.out.println("start of the filter");

//    String name = servletRequest.getParameter("email");
    String password = servletRequest.getParameter("password");
    if(password.equals("hello")){
      wrapper.setNewPassword("world");
      filterChain.doFilter(wrapper, servletResponse);
    }else{
      filterChain.doFilter(servletRequest, servletResponse);
    }
//    System.out.println("email " + name);
//    System.out.println("password "+ password);
//    System.out.println("end of the filter");
//    filterChain.doFilter(servletRequest, servletResponse);

  }

  @Override
  public void destroy() {
  }
}
