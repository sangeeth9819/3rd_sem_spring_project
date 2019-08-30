//package lk.ijse.absd.security;
//
//import lk.ijse.absd.main.CustomBasicAuthenticationEntryPoint;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable();
//        http
//                .authorizeRequests()
//                .antMatchers("/css/**", "/js/**", "/build/**", "/images/**",
//                         "/fonts/**", "/less/**", "/fa/**", "/sign_in").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//
//        http.httpBasic().realmName("MY_TEST_REALM").authenticationEntryPoint(getBasicAuthEntryPoint());
////        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//
//    @Bean
//    public CustomBasicAuthenticationEntryPoint getBasicAuthEntryPoint(){
//        return new CustomBasicAuthenticationEntryPoint();
//    }
//    /* To allow Pre-flight [OPTIONS] request from browser */
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**")
//                .antMatchers("/api/file/{name:.+}");
//
//    }
//
////    @Autowired
////    private DataSource dataSource;
//    @Autowired
//    private Environment environment;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth
//                .inMemoryAuthentication()
//                .withUser("admin").password(environment.getRequiredProperty("1234")).roles("ADMIN");
//
////        auth.jdbcAuthentication().dataSource(dataSource)
////                .usersByUsernameQuery(
////                        "select username , password , enabled from user where username=?")
////                .authoritiesByUsernameQuery(
////                        "select user.username , role.name from  user where username=? ");
//
//    }
//}
