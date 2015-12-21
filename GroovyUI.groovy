/**
 * Created by kusha bk
 *
 *
 */

import javax.swing.*
import java.awt.*

frame = new JFrame(size: [800, 800], layout: new FlowLayout(), defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE)
mybutton=new JButton("COLORS")
mybutton.setForeground(Color.cyan)
colorselect=new JColorChooser()
frame.contentPane.add(mybutton)
frame.contentPane.add(colorselect)
frame.show()

