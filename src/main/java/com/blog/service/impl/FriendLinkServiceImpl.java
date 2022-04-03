package com.blog.service.impl;

import com.blog.dao.FriendLinkDao;
import com.blog.entity.FriendLink;
import com.blog.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 蔡梓阳
 * @Date 2022/4/3 21:37
 */
@Service
public class FriendLinkServiceImpl implements FriendLinkService {

    @Autowired
    private FriendLinkDao friendLinkDao;

    @Override
    public List<FriendLink> listFriendLink() {
        return friendLinkDao.listFriendLink();
    }

    @Override
    public int saveFriendLink(FriendLink friendLink) {
        return friendLinkDao.saveFriendLink(friendLink);
    }

    @Override
    public FriendLink getFriendLink(Integer id) {
        return friendLinkDao.getFriendLink(id);
    }

    @Override
    public FriendLink getFriendLinkByBlogAddress(String blogAddress) {
        return friendLinkDao.getFriendLinkByBlogAddress(blogAddress);
    }

    @Override
    public int updateFriendLink(FriendLink friendLink) {
        return friendLinkDao.updateFriendLink(friendLink);
    }

    @Override
    public void deleteFriendLink(Integer id) {
        friendLinkDao.deleteFriendLink(id);
    }
}
