package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.service.RoleService;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role save(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName name) {
        return roleDao.getByName(name);
    }
}
