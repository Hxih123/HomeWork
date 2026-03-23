// 核心：全部使用 jakarta.servlet 包（适配 Tomcat 10.1.52）
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet 生命周期演示类
 * 访问路径：http://localhost:8080/LifeCycle/lifeCycle
 */
@WebServlet("/lifeCycle") // 配置Servlet访问路径
public class LifeCycleServlet extends HttpServlet {

    // 1. 初始化方法：Servlet创建时执行（仅执行1次）
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("===== Servlet 初始化（init方法）=====");
    }

    // 2. 处理GET请求：每次访问都会执行
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应编码，避免中文乱码
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 向页面输出内容
        out.println("<html>");
        out.println("<head><title>Servlet生命周期演示</title></head>");
        out.println("<body>");
        out.println("<h1 style='color: #2ecc71;'>Servlet 生命周期演示</h1>");
        out.println("<p>当前Servlet状态：正在处理请求（doGet方法执行）</p>");
        out.println("<p>Servlet名称：" + this.getServletName() + "</p>");
        out.println("<p>Servlet上下文路径：" + this.getServletContext().getContextPath() + "</p>");
        out.println("</body>");
        out.println("</html>");

        // 控制台打印请求处理日志
        System.out.println("===== Servlet 处理GET请求（doGet方法）=====");
    }

    // 3. 销毁方法：Servlet销毁时执行（仅执行1次，如Tomcat停止时）
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("===== Servlet 销毁（destroy方法）=====");
    }
}