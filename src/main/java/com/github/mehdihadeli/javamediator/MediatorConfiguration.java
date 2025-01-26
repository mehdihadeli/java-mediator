package com.github.mehdihadeli.javamediator;

import com.github.mehdihadeli.javamediator.abstractions.Mediator;
import com.github.mehdihadeli.javamediator.abstractions.requests.IRequest;
import com.github.mehdihadeli.javamediator.behaviors.LogPipelineBehavior;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(MediatorProperties.class)
@ConditionalOnMissingBean({Mediator.class})
@ConditionalOnClass({Mediator.class})
@ConditionalOnProperty(prefix = "mediator", name = "enabled", havingValue = "true", matchIfMissing = true)
public class MediatorConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Mediator addMediator(ApplicationContext applicationContext) {
        return new MediatorImpl(applicationContext);
    }

    @Bean
    @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    @ConditionalOnMissingBean
    @ConditionalOnProperty(
            prefix = "mediator",
            name = "enabled-log-pipeline",
            havingValue = "true",
            matchIfMissing = true)
    public <TRequest extends IRequest<TResponse>, TResponse>
    LogPipelineBehavior<TRequest, TResponse> addLogPipelineBehavior() {
        return new LogPipelineBehavior<>();
    }
}
