package br.com.moviesbattle.auth;

// @Configuration
// @EnableAuthorizationServer
public class AuthorizationServerConfig {/* extends AuthorizationServerConfigurerAdapter { */

  // @Autowired
  // private PasswordEncoder passwordEncoder;

  // @Autowired
  // private AuthenticationManager authenticationManager;

  // @Override
  // public void configure(ClientDetailsServiceConfigurer clients) throws
  // Exception {
  // clients.inMemory()
  // .withClient("moviesbattle-web")
  // .secret(passwordEncoder.encode("web123"))
  // .authorizedGrantTypes("password")
  // .scopes("write", "read")
  // .accessTokenValiditySeconds(60 * 60 * 6);
  // }

  // @Override
  // public void configure(AuthorizationServerSecurityConfigurer security) throws
  // Exception {
  // security.checkTokenAccess("permitAll()");
  // }

  // @Override
  // public void configure(AuthorizationServerEndpointsConfigurer endpoints)
  // throws Exception {
  // endpoints.authenticationManager(authenticationManager);
  // }
}