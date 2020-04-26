package com.github.technus.tectech.mechanics.structure;


import net.minecraft.block.Block;

public interface IBlockAdder<T> {
    /**
     * Callback on block added
     * @param block block attempted to add
     * @param meta meta of block attempted to add
     * @return is structure still valid
     */
    boolean apply(T t,Block block, Integer meta);
}