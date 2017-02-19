package auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {
 
  public WebSecurityConfig() {
		super();
	
	}

	public WebSecurityConfig(boolean disableDefaults) {
		super(disableDefaults);
		
	}

@Override
  protected void configure(HttpSecurity http) throws Exception {
	System.out.println("In Configure HTTPSecurity...");
    http.authorizeRequests().anyRequest().fullyAuthenticated().and().
    httpBasic().and().
    csrf().disable();
  }
  
}
