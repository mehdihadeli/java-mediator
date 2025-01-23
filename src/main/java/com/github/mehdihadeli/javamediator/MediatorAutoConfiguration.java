package com.github.mehdihadeli.javamediator;

import com.github.mehdihadeli.javamediator.abstractions.IMediator;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@ConditionalOnClass({IMediator.class})
@EnableConfigurationProperties(MediatorProperties.class)
@ConditionalOnProperty(prefix = "mediator", name = "enabled", havingValue = "true", matchIfMissing = true)
@Import(MediatorConfiguration.class)
public class MediatorAutoConfiguration {}
