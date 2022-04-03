package br.com.liftup.forum.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
@Profile("dev")
public class DevSecurityConfigurations extends WebSecurityConfigurerAdapter {

	/*
	 * @Autowired private AutenticacaoService autenticacaoService;
	 * 
	 * @Autowired private TokenService tokenService;
	 * 
	 * @Autowired private UsuarioRepository usuarioRepository;
	 * 
	 * @Override
	 * 
	 * @Bean protected AuthenticationManager authenticationManager() throws
	 * Exception { return super.authenticationManager(); }
	 */

	// Configuracoes de autenticacao
	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.userDetailsService(autenticacaoService).passwordEncoder(new
	 * BCryptPasswordEncoder()); }
	 */

	// Configuracoes de autorizacao
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests() .antMatchers(HttpMethod.GET, "/topicos").permitAll()
	 * .antMatchers(HttpMethod.GET, "/topicos/*").permitAll()
	 * .antMatchers(HttpMethod.POST, "/auth").permitAll()
	 * .antMatchers(HttpMethod.GET, "/actuator/**").permitAll()
	 * .antMatchers(HttpMethod.DELETE, "/topicos/*").hasRole("MODERADOR")
	 * .anyRequest().authenticated() .antMatchers("/**").permitAll()
	 * .and().csrf().disable()
	 * .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	 * .and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService,
	 * usuarioRepository), UsernamePasswordAuthenticationFilter.class); }
	 */

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/**").permitAll().and().csrf().disable();
	}

	// Configuracoes de recursos estaticos(js, css, imagens, etc.)
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**.html", "/v2/api-docs", "/webjars/**", "/configuration/**",
				"/swagger-resources/**");
	}

	/*
	 * public static void main(String[] args) { System.out.println(new
	 * BCryptPasswordEncoder().encode("123456")); }
	 */
}