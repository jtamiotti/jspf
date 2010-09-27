/*
 * PluginInformation.java
 *
 * Copyright (c) 2008, Ralf Biedert All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of
 * conditions and the following disclaimer. Redistributions in binary form must reproduce the
 * above copyright notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package net.xeoh.plugins.base;

import net.xeoh.plugins.base.supervision.SupervisionListener;

/**
 * Manages meta access to plugins. This is very beta. Expect unexpected behavior. Especially
 * plugins deriving from other plugins and parameterized plugins are in danger of being broken. 
 *
 * @author Ralf Biedert
 */
public interface PluginSupervisor extends Plugin {

    /**
     * Adds a supervisor for the given plugin. If any of the plugin's method is being called 
     * the supervisor is consulted before.
     * 
     * @param plugin The plugin to add a supervisor for. 
     * @param supervisor The supervisor to add.
     */
    public void addSupervisorFor(Plugin plugin, SupervisionListener supervisor);

    /**
     * 
     * Adds a supervisors that listens to calls of every plugin (except the PluginManager itself 
     * and the PluginSupvervisor).
     * 
     * @param supervisor The supervisor to add for all plugins.
     */
    public void addGeneralSupervisor(SupervisionListener supervisor);

}