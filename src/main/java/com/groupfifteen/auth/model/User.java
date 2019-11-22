package com.groupfifteen.auth.model;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    private String email;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dob;
    
    private String country;
    
    private String username;

    private String password;

    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;
    
    @ManyToMany(mappedBy = "ownerUsers")
    private Set<Event> createdEvents;
    
    @ManyToMany(mappedBy = "participantUsers")
    private Set<Event> joinedEvents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<Event> getCreatedEvents() {
		return createdEvents;
	}

	public void setCreatedEvents(Set<Event> createdEvents) {
		this.createdEvents = createdEvents;
	}

	public Set<Event> getJoinedEvents() {
		return joinedEvents;
	}

	public void setJoinedEvents(Set<Event> joinedEvents) {
		this.joinedEvents = joinedEvents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((createdEvents == null) ? 0 : createdEvents.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((joinedEvents == null) ? 0 : joinedEvents.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((passwordConfirm == null) ? 0 : passwordConfirm.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (createdEvents == null) {
			if (other.createdEvents != null)
				return false;
		} else if (!createdEvents.equals(other.createdEvents))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (joinedEvents == null) {
			if (other.joinedEvents != null)
				return false;
		} else if (!joinedEvents.equals(other.joinedEvents))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (passwordConfirm == null) {
			if (other.passwordConfirm != null)
				return false;
		} else if (!passwordConfirm.equals(other.passwordConfirm))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
