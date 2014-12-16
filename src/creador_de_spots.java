import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;
import java.awt.event.*;
public class creador_de_spots extends Frame implements ActionListener, ItemListener{
int ErrorCode=0;
MenuBar mb;
File f= new File("spots.txt");
PrintWriter pw;
ImageIcon mounstro;
Choice mapa;
Label Lmapa;
MenuItem sm;
Choice mapa2;
Choice lor;
Choice dev;
Choice nor;
Choice dun;
Choice atl;
Choice lt;
Choice tar;
Choice ica;
Label moun;
Choice def;
TextField movimiento;
Label lmovimiento;
TextField x1;
TextField y1;
TextField x2;
TextField y2;
Label l1;
Label l2;
Label coordenadas;
Label titulo;
TextField cantidad;
Checkbox archivo;
Label l3;
Button enviar;
Button limpiar;
String codigo;
String [] codigox=new String [2];
public void init(){
mapa.select(0);
mapa2.select(0);
def.select(0);
lor.select(0);
dev.select(0);
nor.select(0);
dun.select(0);
atl.select(0);
lt.select(0);
tar.select(0);
ica.select(0);
def.setVisible(true);
lor.setVisible(false);
dev.setVisible(false);
nor.setVisible(false);
dun.setVisible(false);
atl.setVisible(false);
lt.setVisible(false);
tar.setVisible(false);
ica.setVisible(false);
movimiento.setText("2");
x1.setText("");
x2.setText("");
y1.setText("");
y2.setText("");
cantidad.setText("15");
archivo.setState(false);
//mounstro=new ImageIcon("imagenes/default.jpg");
mounstro=new ImageIcon(getClass().getResource("/imagenes/default.jpg")); 
repaint();
}

public void paint(Graphics g){
g.drawImage(mounstro.getImage(),187,219, this);
}

public void itemStateChanged(ItemEvent e){
if(e.getSource()==mapa2){
def.select(0);
lor.select(0);
dev.select(0);
nor.select(0);
dun.select(0);
atl.select(0);
lt.select(0);
tar.select(0);
ica.select(0);
if(mapa2.getSelectedIndex()==0){
def.setVisible(true);
lor.setVisible(false);
dev.setVisible(false);
nor.setVisible(false);
dun.setVisible(false);
atl.setVisible(false);
lt.setVisible(false);
tar.setVisible(false);
ica.setVisible(false);
}
if(mapa2.getSelectedIndex()==1){
def.setVisible(false);
lor.setVisible(false);
dev.setVisible(false);
nor.setVisible(false);
dun.setVisible(false);
atl.setVisible(true);
lt.setVisible(false);
tar.setVisible(false);
ica.setVisible(false);
}
if(mapa2.getSelectedIndex()==2){
def.setVisible(false);
lor.setVisible(false);
dev.setVisible(true);
nor.setVisible(false);
dun.setVisible(false);
atl.setVisible(false);
lt.setVisible(false);
tar.setVisible(false);
ica.setVisible(false);
}
if(mapa2.getSelectedIndex()==3){
def.setVisible(false);
lor.setVisible(false);
dev.setVisible(false);
nor.setVisible(false);
dun.setVisible(true);
atl.setVisible(false);
lt.setVisible(false);
tar.setVisible(false);
ica.setVisible(false);
}
if(mapa2.getSelectedIndex()==4){
def.setVisible(false);
lor.setVisible(false);
dev.setVisible(false);
nor.setVisible(false);
dun.setVisible(false);
atl.setVisible(false);
lt.setVisible(false);
tar.setVisible(false);
ica.setVisible(true);
}
if(mapa2.getSelectedIndex()==5){
def.setVisible(false);
lor.setVisible(true);
dev.setVisible(false);
nor.setVisible(false);
dun.setVisible(false);
atl.setVisible(false);
lt.setVisible(false);
tar.setVisible(false);
ica.setVisible(false);
}
if(mapa2.getSelectedIndex()==6){
def.setVisible(false);
lor.setVisible(false);
dev.setVisible(false);
nor.setVisible(false);
dun.setVisible(false);
atl.setVisible(false);
lt.setVisible(true);
tar.setVisible(false);
ica.setVisible(false);
}
if(mapa2.getSelectedIndex()==7){
def.setVisible(false);
lor.setVisible(false);
dev.setVisible(false);
nor.setVisible(true);
dun.setVisible(false);
atl.setVisible(false);
lt.setVisible(false);
tar.setVisible(false);
ica.setVisible(false);
}
if(mapa2.getSelectedIndex()==8){
def.setVisible(false);
lor.setVisible(false);
dev.setVisible(false);
nor.setVisible(false);
dun.setVisible(false);
atl.setVisible(false);
lt.setVisible(false);
tar.setVisible(true);
ica.setVisible(false);
}

}
bd bd=new bd();
if(e.getSource()==lor){
mounstro=bd.getMonster(mapa2.getSelectedIndex(), lor.getSelectedIndex());
}
if(e.getSource()==dev){
mounstro=bd.getMonster(mapa2.getSelectedIndex(), dev.getSelectedIndex());
}
if(e.getSource()==nor){
mounstro=bd.getMonster(mapa2.getSelectedIndex(), nor.getSelectedIndex());
}
if(e.getSource()==dun){
mounstro=bd.getMonster(mapa2.getSelectedIndex(), dun.getSelectedIndex());
}
if(e.getSource()==atl){
mounstro=bd.getMonster(mapa2.getSelectedIndex(), atl.getSelectedIndex());
}
if(e.getSource()==lt){
mounstro=bd.getMonster(mapa2.getSelectedIndex(), lt.getSelectedIndex());
}
if(e.getSource()==tar){
mounstro=bd.getMonster(mapa2.getSelectedIndex(), tar.getSelectedIndex());
}
if(e.getSource()==ica){
mounstro=bd.getMonster(mapa2.getSelectedIndex(), ica.getSelectedIndex());
}
repaint();
}

public void programa(){
setLayout(null);
setBackground(Color.black);
setSize(700, 700);
mb=new MenuBar();
Menu m= new Menu("sistema");
mb.add(m);
sm=new MenuItem("Informacion");
m.add(sm);
sm.addActionListener(this);
setMenuBar(mb);
mapa=new Choice();
mapa.add("");
mapa.add("Lorencia");
mapa.add("Noria");
mapa.add("Devias");
mapa.add("Dungeon");
mapa.add("LostTower");
mapa.add("Arena");
mapa.add("Atlans");
mapa.add("Tarkan");
mapa.add("icarus");
mapa.setLocation(350, 100);
mapa.setSize(100, 26);
add(mapa);
Lmapa=new Label("selecciona el mapa para colocar el spot");
Lmapa.setForeground(Color.red);
Lmapa.setLocation(50, 100);
Lmapa.setSize(300, 26);
add(Lmapa);
moun= new Label("Selecciona el mapa al que pertenece el mounstro que desea, acontinuacion seleccione el mounstro");
moun.setForeground(Color.white);
moun.setLocation(50, 140);
moun.setSize(600, 26);
add(moun);
mapa2=new Choice();
mapa2.add("");
mapa2.add("Atlans");
mapa2.add("Devias");
mapa2.add("Dungeon");
mapa2.add("Icarus");
mapa2.add("Lorencia");
mapa2.add("Lost Tower");
mapa2.add("Noria");
mapa2.add("Tarkan");
mapa2.setLocation(200, 170);
mapa2.setSize(100, 26);
add(mapa2);
def=new Choice();
def.add("primero seleccione el mapa");
def.setLocation(400, 170);
def.setSize(200, 26);
add(def);
lor=new Choice();
lor.add("");
lor.add("Spider");
lor.add("Budge Dragon");
lor.add("Bull figther");
lor.add("Hound");
lor.add("Elite Bull Figther");
lor.add("Lich");
lor.add("Esqueleto");
lor.add("Gigante");
lor.setLocation(400, 170);
lor.setSize(200, 26);
add(lor);
lor.setVisible(false);
dev=new Choice();
dev.add("");
dev.add("Worm");
dev.add("Ice monster");
dev.add("Hommerd");
dev.add("Assasin");
dev.add("Yeti");
dev.add("Elie Yeti");
dev.add("Ice Queen");
dev.setLocation(400, 170);
dev.setSize(200, 26);
add(dev);
dev.setVisible(false);
nor=new Choice();
nor.add("");
nor.add("Goblin");
nor.add("Cadena Scorpion");
nor.add("Elit Goblin");
nor.add("Monster beetle");
nor.add("Hunter");
nor.add("Monster Forest");
nor.add("Agon");
nor.add("Stone Golem");
nor.setLocation(400, 170);
nor.setSize(200, 26);
add(nor);
nor.setVisible(false);
dun=new Choice();
dun.add("");
dun.add("Esqueleto");
dun.add("Larva");
dun.add("Cyclop");
dun.add("Gosth");
dun.add("Skeleton archer");
dun.add("Hell Hound");
dun.add("Hell Spider");
dun.add("Elite Skeleton");
dun.add("thunder lich");
dun.add("Poison Bull Figther");
dun.add("Dark Knigth");
dun.add("Gorgon");
dun.setLocation(400, 170);
dun.setSize(200, 26);
add(dun);
dun.setVisible(false);
atl=new Choice();
atl.add("");
atl.add("Bahamut");
atl.add("Vepar");
atl.add("Valkyrie");
atl.add("Great Bahamut");
atl.add("Silver valkyrie");
atl.add("Lizard King");
atl.add("Hydra");
atl.setLocation(400, 170);
atl.setSize(200, 26);
add(atl);
atl.setVisible(false);
lt= new Choice();
lt.add("");
lt.add("Shadow");
lt.add("Poison Shadow");
lt.add("Cursed Wizard");
lt.add("Death cow");
lt.add("Devil");
lt.add("Death Knigth");
lt.add("Death gorgon");
lt.add("Balrog");
lt.setLocation(400, 170);
lt.setSize(200, 26);
add(lt);
lt.setVisible(false);
tar= new Choice();
tar.add("");
tar.add("Mutant");
tar.add("Bloody Wolf");
tar.add("Iron Wheel"); 
tar.add("Tantalos"); 
tar.add("Beam Knight"); 
tar.add("Zaikan"); 
tar.add("Death Beam Knight"); 
tar.setLocation(400, 170);
tar.setSize(200, 26);
add(tar);
tar.setVisible(false);
ica=new Choice();
ica.add("");
ica.add("Alquamos");
ica.add("Mega Crust");
ica.add("Queen Ranier"); 
ica.add("Drakan"); 
ica.add("Alpha Crust"); 
ica.add("Phantom Knight"); 
ica.add("Great Red Drakan"); 
ica.add("Phoenix of Darkness");
ica.setLocation(400, 170);
ica.setSize(200, 26);
add(ica);
ica.setVisible(false);
mapa2.addItemListener(this);
lor.addItemListener(this);
dev.addItemListener(this);
nor.addItemListener(this);
dun.addItemListener(this);
atl.addItemListener(this);
lt.addItemListener(this);
tar.addItemListener(this);
ica.addItemListener(this);
lmovimiento=new Label("A continucacion introdusca un numero entero positivo para determinar el radio de movimiento de los moustros");
lmovimiento.setSize(650,26);
lmovimiento.setLocation(50, 450);
lmovimiento.setForeground(Color.white);
add(lmovimiento);
movimiento=new TextField();
movimiento.setSize(70,26);
movimiento.setLocation(330, 480);
add(movimiento);
coordenadas=new Label("Introdusca las coordenadas para el spot (numeros enteros positivos)");
coordenadas.setSize(600,26);
coordenadas.setLocation(50, 510);
coordenadas.setForeground(Color.white);
titulo= new Label();
Font fon= new Font ("Arial", Font.BOLD, 30);
titulo.setFont(fon);
titulo.setText("Creador de Spots");
titulo.setSize(300, 43);
titulo.setLocation(200, 50);
titulo.setForeground(Color.blue);
add(titulo);

add(coordenadas);
l1=new Label("x1                                          y1                                          x2                                          y2");
l1.setSize(600, 26);
l1.setLocation(50, 530);
l1.setForeground(Color.white);
add(l1);
x1=new TextField();
x1.setSize(50, 26);
x1.setLocation(50, 556);
add(x1);
y1=new TextField();
y1.setSize(50, 26);
y1.setLocation(190, 556);
add(y1);
x2=new TextField();
x2.setSize(50, 26);
x2.setLocation(330, 556);
add(x2);
y2=new TextField();
y2.setSize(50, 26);
y2.setLocation(470, 556);
add(y2);
l2=new Label("introdusca la cantidad de mounstros (recomendado no mas que 20)");
l2.setSize(400,26);
l2.setLocation(50,585);
l2.setForeground(Color.white);
add(l2);
cantidad=new TextField();
cantidad.setSize(50,26);
cantidad.setLocation(450, 585);
add(cantidad);
archivo=new Checkbox();
archivo.setSize(30,30);
archivo.setLocation(160,640);
add(archivo);
l3=new Label ("¿Reiniciar archivo?");
l3.setSize(100,26);
l3.setLocation(50, 640);
l3.setForeground(Color.white);
add(l3);
enviar=new Button("enviar");
enviar.setSize(50,26);
enviar.setLocation(400, 660);
enviar.addActionListener(this);
add(enviar);
limpiar=new Button("limpiar");
limpiar.setSize(50,26);
limpiar.setLocation(500, 660);
limpiar.addActionListener(this);
add(limpiar);
addWindowListener(new cerrar());
setVisible(true);
init();
}


public void actionPerformed (ActionEvent e){
if(e.getSource()==sm){
javax.swing.JOptionPane.showMessageDialog(null,"Creador de Spots\nVersion:1.5 beta\nProgramado por: Evangx \nsoporte: ","Informacion",javax.swing.JOptionPane.INFORMATION_MESSAGE);
}
if(e.getSource()==limpiar){
init();
}
if(e.getSource()==enviar){
bd bd= new bd();
switch (mapa2.getSelectedIndex()){
case 1:
codigox=bd.getCode(mapa2.getSelectedIndex(), atl.getSelectedIndex());
break;
case 2:
codigox=bd.getCode(mapa2.getSelectedIndex(), dev.getSelectedIndex());
break;
case 3:
codigox=bd.getCode(mapa2.getSelectedIndex(), dun.getSelectedIndex());
break;
case 4:
codigox=bd.getCode(mapa2.getSelectedIndex(), ica.getSelectedIndex());
break;
case 5:
codigox=bd.getCode(mapa2.getSelectedIndex(), lor.getSelectedIndex());
break;
case 6:
codigox=bd.getCode(mapa2.getSelectedIndex(), lt.getSelectedIndex());
break;
case 7:
codigox=bd.getCode(mapa2.getSelectedIndex(), nor.getSelectedIndex());
break;
case 8:
codigox=bd.getCode(mapa2.getSelectedIndex(), tar.getSelectedIndex());
break;
default:
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha seleccionado correctamente el mapa","No se ha seleccionado correctamente el mapa",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}

if(ErrorCode!=1){
if(tar.getSelectedIndex()==0 & nor.getSelectedIndex()==0 & lt.getSelectedIndex()==0 & lor.getSelectedIndex()==0 & ica.getSelectedIndex()==0 & dun.getSelectedIndex()==0 & dev.getSelectedIndex()==0 & atl.getSelectedIndex()==0){
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha seleccionado correctamente el mounstro que se desea","No se ha seleccionado correctamente el mounstro",javax.swing.JOptionPane.ERROR_MESSAGE);
}
else if(mapa.getSelectedIndex()==0){
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha seleccionado correctamente el mapa donde se desea el spot","No se ha seleccionado correctamente el mapa para el spot",javax.swing.JOptionPane.ERROR_MESSAGE);
}
else{
try{
int a=Integer.parseInt(movimiento.getText());
}
catch(Exception ex){
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha llenado el dato para el momiviento correctamente","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
try{
int a=Integer.parseInt(x1.getText());
if(a<0){
javax.swing.JOptionPane.showMessageDialog(null,"Error: X1 no puede ser negativa","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
}
catch(Exception ex){
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha llenado la primer cordenada( 'X1' ) correctamente","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
try{
int a=Integer.parseInt(x2.getText());
if(a<0){
javax.swing.JOptionPane.showMessageDialog(null,"Error: X2 no puede ser negativa","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
}
catch(Exception ex){
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha llenado la segunda cordenada( 'X2' ) correctamente","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
try{
int a=Integer.parseInt(y1.getText());
if(a<0){
javax.swing.JOptionPane.showMessageDialog(null,"Error: Y1 no puede ser negativa","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
}
catch(Exception ex){
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha llenado la primer cordenada( 'Y1' ) correctamente","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
try{
int a=Integer.parseInt(y2.getText());
if(a<0){
javax.swing.JOptionPane.showMessageDialog(null,"Error: Y2 no puede ser negativa","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
}
catch(Exception ex){
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha llenado la segunda cordenada( 'Y2' ) correctamente","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
try{
int a=Integer.parseInt(cantidad.getText());
if(a<0){
javax.swing.JOptionPane.showMessageDialog(null,"Error: La cantidad no puede ser negativa","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}
}
catch(Exception ex){
javax.swing.JOptionPane.showMessageDialog(null,"Error: No se ha proporcionado un numero valido para la cantidad de mounstros en el spot","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
ErrorCode=1;
}

if(ErrorCode!=1){
codigo=""+codigox[0];
codigo+=" "+bd.getMap(mapa.getSelectedIndex());
codigo+=" "+movimiento.getText();
codigo+=" "+x1.getText()+" "+y1.getText()+" "+x2.getText()+" "+y2.getText()+" -1"+" "+cantidad.getText();
codigo+="//"+mapa.getSelectedItem()+" " +codigox[1];
try{
f.createNewFile();
FileWriter fw=new FileWriter(f, !archivo.getState());
pw=new PrintWriter(fw);
pw.println(codigo);
pw.flush();
pw.close();
}
catch(Exception er){
System.out.println("error");
}
javax.swing.JOptionPane.showMessageDialog(null,"Spot creado correctamente","Proceso terminado",javax.swing.JOptionPane.INFORMATION_MESSAGE);
init();
}
}
}
ErrorCode=0;

}
}

public static void main(String []args){
creador_de_spots a = new creador_de_spots();
a.programa();
}
}