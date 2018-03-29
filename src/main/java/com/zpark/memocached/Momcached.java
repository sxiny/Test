package com.zpark.memocached;

import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;

public class Momcached {

    public static void main(String[] args) {


        MemcachedClientBuilder memcachedClientBuilder = new XMemcachedClientBuilder(
                AddrUtil.getAddresses("192.168.100.132:11211"));
        System.out.println("hahahhahahhahahahha");
    }
}
