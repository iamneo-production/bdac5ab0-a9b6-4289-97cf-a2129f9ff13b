<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.Config;
package com.examly.springapp.config;
=======
package com.examly.springapp.config;

>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
package com.examly.springapp.config;

>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}
