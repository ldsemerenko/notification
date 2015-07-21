package com.smoketurner.notification.application.managed;

import io.dropwizard.lifecycle.Managed;
import javax.annotation.Nonnull;
import com.google.common.base.Preconditions;
import com.smoketurner.notification.application.store.NotificationStore;

public class NotificationStoreManager implements Managed {

    private final NotificationStore store;

    /**
     * Constructor
     *
     * @param store
     *            Notification store to manage
     */
    public NotificationStoreManager(@Nonnull final NotificationStore store) {
        this.store = Preconditions.checkNotNull(store);
    }

    @Override
    public void start() throws Exception {
        store.initialize();
    }

    @Override
    public void stop() throws Exception {
        // nothing to stop
    }
}