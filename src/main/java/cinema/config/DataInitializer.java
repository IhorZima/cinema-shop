package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public String injectData() {
        Role roleAdmin = new Role();
        roleAdmin.setRoleName(Role.RoleName.ADMIN);
        roleService.save(roleAdmin);
        Role roleUser = new Role();
        roleUser.setRoleName(Role.RoleName.USER);
        roleService.save(roleUser);
        User bob = new User();
        bob.setPassword("1234");
        bob.setEmail("bob@i.com");
        bob.setRoles(Set.of(roleAdmin, roleUser));
        userService.add(bob);
        User john = new User();
        john.setPassword("1234");
        john.setEmail("john@i.com");
        john.setRoles(Set.of(roleUser, roleAdmin));
        userService.add(john);
        return "Done!";
    }
}
