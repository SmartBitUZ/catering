package com.smartbit.catering.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 26.03.2014.
 */
public final class AuthService implements UserDetailsService {
    public static final String SESSION_CURRENT_USER_ID = "__current_user_id__";
    public static final String SESSION_CURRENT_USER_FIO = "__current_user_fio__";
//    @Autowired
//    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(final String loginParam)
            throws UsernameNotFoundException {
//        final User currentUser = userDao.findUserByLogin(loginParam);
//        if (currentUser != null) {
//            final List<GrantedAuthority> roles = new ArrayList<>();
//            for (final String function : currentUser.getFunctions())
//                roles.add(new SimpleGrantedAuthority(function));
//            SessionUtils.setSessionParameter(SESSION_CURRENT_USER_ID, currentUser.getId());
//            SessionUtils.setSessionParameter(SESSION_CURRENT_USER_FIO, currentUser.getFio());
//            return new org.springframework.security.core.userdetails.User(loginParam, currentUser.getPassword(), roles);
//        }
        throw new UsernameNotFoundException("user not found");
    }
}
