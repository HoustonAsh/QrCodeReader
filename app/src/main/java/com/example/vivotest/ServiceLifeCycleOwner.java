package com.example.vivotest;


import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

class ServiceLifeCycleOwner implements LifecycleOwner {

private LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    public void init() {
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
    }

    public void start() {
        lifecycleRegistry.setCurrentState(Lifecycle.State.STARTED);
    }

    public void stop() {
        lifecycleRegistry.setCurrentState(Lifecycle.State.DESTROYED);
    }

    @Override
    public Lifecycle getLifecycle() { return lifecycleRegistry; }
}