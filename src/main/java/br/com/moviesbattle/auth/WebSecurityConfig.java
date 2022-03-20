package br.com.moviesbattle.auth;

//@EnableWebSecurity
public class WebSecurityConfig/* extends WebSecurityConfigurerAdapter */ {

  // @Override
  // protected void configure(HttpSecurity http) throws Exception {
  // http
  // .httpBasic()
  // .and()
  // .authorizeRequests()
  // .anyRequest()
  // .authenticated()
  // .and()
  // .sessionManagement()
  // .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  // }

  // @Override
  // protected void configure(AuthenticationManagerBuilder auth) throws Exception
  // {
  // auth.inMemoryAuthentication()
  // .withUser("marcelo")
  // .password(passwordEncoder().encode("123"))
  // .roles("ADMIN")
  // .and()
  // .withUser("joao")
  // .password(passwordEncoder().encode("123"))
  // .roles("ADMIN");
  // }

  // @Bean
  // public PasswordEncoder passwordEncoder() {
  // return new BCryptPasswordEncoder();
  // }

  // @Bean
  // @Override
  // protected AuthenticationManager authenticationManager() throws Exception {
  // return super.authenticationManager();
  // }
}
