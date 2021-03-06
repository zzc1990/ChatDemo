package com.maxi.chatdemo.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.maxi.chatdemo.db.ChatMessageBean;

import com.maxi.chatdemo.db.ChatMessageBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig chatMessageBeanDaoConfig;

    private final ChatMessageBeanDao chatMessageBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        chatMessageBeanDaoConfig = daoConfigMap.get(ChatMessageBeanDao.class).clone();
        chatMessageBeanDaoConfig.initIdentityScope(type);

        chatMessageBeanDao = new ChatMessageBeanDao(chatMessageBeanDaoConfig, this);

        registerDao(ChatMessageBean.class, chatMessageBeanDao);
    }
    
    public void clear() {
        chatMessageBeanDaoConfig.clearIdentityScope();
    }

    public ChatMessageBeanDao getChatMessageBeanDao() {
        return chatMessageBeanDao;
    }

}
