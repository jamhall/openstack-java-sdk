package com.woorea.openstack.keystone.v3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName("auth")
public class Authentication implements Serializable {
	
	public static final class Identity {
		
		public static final Identity password(String name, String password) {
			Identity identity = new Identity();
			identity.getMethods().add("password");
			Password method = new Password();
			method.getUser().setName(name);
			method.getUser().setPassword(password);
			identity.setPassword(method);
			return identity;
		}
		
		private List<String> methods = new ArrayList<String>();
		
		public static final class Password {
			
			public static final class User {
				
				public static final class Domain {
					
					private String id;
					
					private String name;

					public String getId() {
						return id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getName() {
						return name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}
				
				private Domain domain;
				
				private String id;
				
				private String name;
				
				private String password;

				public Domain getDomain() {
					return domain;
				}

				public void setDomain(Domain domain) {
					this.domain = domain;
				}

				public String getId() {
					return id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getPassword() {
					return password;
				}

				public void setPassword(String password) {
					this.password = password;
				}
				
			}
			
			private User user = new User();

			public User getUser() {
				return user;
			}

			public void setUser(User user) {
				this.user = user;
			}
			
		}
		
		private Password password;
		
		public static final class Token {
			
			private String id;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}
			
		}
		
		private Token token;

		public List<String> getMethods() {
			return methods;
		}

		public void setMethods(List<String> methods) {
			this.methods = methods;
		}

		public Password getPassword() {
			return password;
		}

		public void setPassword(Password password) {
			this.password = password;
		}

		public Token getToken() {
			return token;
		}

		public void setToken(Token token) {
			this.token = token;
		}
		
	}
	
	private Identity identity;
	
	public static final class Scope {
		
		public static final class Project {
		
			public static final class Domain {
				
				private String id;
				
				private String name;

				public String getId() {
					return id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
			
			private String id;
			
			private String name;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
			
		}
		
	}
	
	private Scope scope;

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}
	
}
