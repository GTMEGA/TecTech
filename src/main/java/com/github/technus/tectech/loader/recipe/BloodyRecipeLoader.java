package com.github.technus.tectech.loader.recipe;

import com.github.technus.tectech.thing.metaTileEntity.multi.em_machine.Behaviour_Centrifuge;
import com.github.technus.tectech.thing.metaTileEntity.multi.em_machine.Behaviour_ElectromagneticSeparator;
import com.github.technus.tectech.thing.metaTileEntity.multi.em_machine.Behaviour_Recycler;
import com.github.technus.tectech.thing.metaTileEntity.multi.em_machine.GT_MetaTileEntity_EM_machine;
import gregtech.api.enums.ItemList;


/**
 * Created by Tec on 06.08.2017.
 */
public class BloodyRecipeLoader implements Runnable {
    @Override
    public void run() {
        register_machine_EM_behaviours();
    }

    private void register_machine_EM_behaviours() {
        GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(5), ItemList.Machine_IV_Centrifuge.get(1));
        try {
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(6), ItemList.valueOf("Machine_LuV_Centrifuge").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(7), ItemList.valueOf("Machine_ZPM_Centrifuge").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(8), ItemList.valueOf("Machine_UV_Centrifuge").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(9), ItemList.valueOf("Machine_UV_Centrifuge").get(4));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(10), ItemList.valueOf("Machine_UV_Centrifuge").get(16));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(11), ItemList.valueOf("Machine_UV_Centrifuge").get(40));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(12), ItemList.valueOf("Machine_UV_Centrifuge").get(64));
        } catch (IllegalArgumentException | NullPointerException e) {
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(6), ItemList.Machine_IV_Centrifuge.get(2));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(7), ItemList.Machine_IV_Centrifuge.get(4));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(8), ItemList.Machine_IV_Centrifuge.get(8));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(9), ItemList.Machine_IV_Centrifuge.get(16));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(10), ItemList.Machine_IV_Centrifuge.get(32));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(11), ItemList.Machine_IV_Centrifuge.get(48));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Centrifuge(12), ItemList.Machine_IV_Centrifuge.get(64));
        }

        GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(5), ItemList.Machine_IV_ElectromagneticSeparator.get(1));
        try {
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(6), ItemList.valueOf("Machine_LuV_ElectromagneticSeparator").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(7), ItemList.valueOf("Machine_ZPM_ElectromagneticSeparator").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(8), ItemList.valueOf("Machine_UV_ElectromagneticSeparator").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(9), ItemList.valueOf("Machine_UV_ElectromagneticSeparator").get(4));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(10), ItemList.valueOf("Machine_UV_ElectromagneticSeparator").get(16));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(11), ItemList.valueOf("Machine_UV_ElectromagneticSeparator").get(40));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(12), ItemList.valueOf("Machine_UV_ElectromagneticSeparator").get(64));
        } catch (IllegalArgumentException | NullPointerException e) {
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(6), ItemList.Machine_IV_ElectromagneticSeparator.get(2));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(7), ItemList.Machine_IV_ElectromagneticSeparator.get(4));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(8), ItemList.Machine_IV_ElectromagneticSeparator.get(8));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(9), ItemList.Machine_IV_ElectromagneticSeparator.get(16));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(10), ItemList.Machine_IV_ElectromagneticSeparator.get(32));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(11), ItemList.Machine_IV_ElectromagneticSeparator.get(48));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_ElectromagneticSeparator(12), ItemList.Machine_IV_ElectromagneticSeparator.get(64));
        }

        GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(5), ItemList.Machine_IV_Recycler.get(1));
        try {
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(6), ItemList.valueOf("Machine_LuV_Recycler").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(7), ItemList.valueOf("Machine_ZPM_Recycler").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(8), ItemList.valueOf("Machine_UV_Recycler").get(1));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(9), ItemList.valueOf("Machine_UV_Recycler").get(4));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(10), ItemList.valueOf("Machine_UV_Recycler").get(16));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(11), ItemList.valueOf("Machine_UV_Recycler").get(40));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(12), ItemList.valueOf("Machine_UV_Recycler").get(64));
        } catch (IllegalArgumentException | NullPointerException e) {
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(6), ItemList.Machine_IV_Recycler.get(2));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(7), ItemList.Machine_IV_Recycler.get(4));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(8), ItemList.Machine_IV_Recycler.get(8));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(9), ItemList.Machine_IV_Recycler.get(16));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(10), ItemList.Machine_IV_Recycler.get(32));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(11), ItemList.Machine_IV_Recycler.get(48));
            GT_MetaTileEntity_EM_machine.registerBehaviour(() -> new Behaviour_Recycler(12), ItemList.Machine_IV_Recycler.get(64));
        }
    }
}