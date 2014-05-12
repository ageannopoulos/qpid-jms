/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.qpid.jms.engine;

import java.io.IOException;
import java.io.Serializable;

import org.apache.qpid.proton.engine.Delivery;
import org.apache.qpid.proton.message.Message;

public abstract class AmqpObjectMessage extends AmqpMessage
{
    public AmqpObjectMessage()
    {
        super();
    }

    public AmqpObjectMessage(Message message, Delivery delivery, AmqpConnection amqpConnection)
    {
        super(message, delivery, amqpConnection);
    }

    public abstract void setObject(Serializable serializable) throws IOException;

    public abstract Serializable getObject() throws IOException, ClassNotFoundException;
}
