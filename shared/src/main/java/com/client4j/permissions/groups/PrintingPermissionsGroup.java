/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client4j.permissions.groups;

import com.client4j.permissions.PermissionPattern;
import com.client4j.permissions.PermissionsGroup;

/**
 *
 * @author shannah
 */
public class PrintingPermissionsGroup extends PermissionsGroup {
    public PrintingPermissionsGroup() {
        setName("Printing Access");
        setDescription("This app has requested access to use your printer");
        getPatterns(true).add(new PermissionPattern("java.lang.RuntimePermission", "queuePrintJob"));
    }
}
