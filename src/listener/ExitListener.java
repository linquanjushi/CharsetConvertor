/*
 * Copyright(C) 2013 Agree Corporation. All rights reserved.
 * 
 * Contributors:
 *     Agree Corporation - initial API and implementation
 */
package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 *
 * @author Lee
 * @date 2017��8��22�� ����5:01:51
 * @version 1.0
 *
 */
public class ExitListener implements ActionListener{

    /* 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);        
    }

}
