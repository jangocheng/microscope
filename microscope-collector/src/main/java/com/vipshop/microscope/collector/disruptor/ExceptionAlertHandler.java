package com.vipshop.microscope.collector.disruptor;

import com.lmax.disruptor.EventHandler;
import com.vipshop.microscope.collector.alerter.MessageAlerter;
import com.vipshop.microscope.common.util.ThreadPoolUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;

/**
 * Exception alert handler.
 *
 * @author Xu Fei
 * @version 1.0
 */
public class ExceptionAlertHandler implements EventHandler<ExceptionEvent> {

    public static final Logger logger = LoggerFactory.getLogger(ExceptionAlertHandler.class);

    private final MessageAlerter messageAlerter = MessageAlerter.getMessageAlerter();

    private final ExecutorService exceptionStorageWorkerExecutor = ThreadPoolUtil.newFixedThreadPool(1, "exception-saveAppLog-worker-pool");

    @Override
    public void onEvent(final ExceptionEvent event, long sequence, boolean endOfBatch) throws Exception {
        messageAlerter.alert(event.getResult());

    }


}