// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j324.java 
 * created : Time-stamp: <09/06/30(��) 08:53:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j324.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j324.java >>
//
//  �A�v���b�g�i�Q�j�F���C�A�E�g�}�l�[�W���[�iGridBagLayout�j
//
//�@�@GridBagLayout�}�l�[�W���[���g���ƁA�قȂ�傫���̕��i���c���ɏ_��ɔz�u
//�@�@���邱�Ƃ��ł���B
//�@�@�̈���i�q��̃Z���ɕ������A�Z���ɕ��i��z�u���Ă����B
//
//�@���Z���ƃA�h���X
//
//�@�@�̈���i�q��̃Z���ɕ������Z���Ɋ��蓖�Ă�ꂽ�A�h���X
//�@�@�i�s�Ɨ�Ŏw�肷��j���w�肵�ĕ��i��z�u����B�ЂƂ̕��i��
//�@�@�����̃Z�����L���Ă��悢�B
//
//    �E�̈���i�q�ɕ�������B�}�X�ڂ��Z���ƌĂԁB
//    �@�@�|�|�|�|�|�|�|�|�|�|�|�|�|
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   �ΐ������Z���B
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//    �@�@�|�|�|�|�|�|�|�|�|�|�|�|�|
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//    �@�@�|�|�|�|�|�|�|�|�|�|�|�|�|
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//    �@�@�|�|�|�|�|�|�|�|�|�|�|�|�|
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//    �@�@�|�|�|�|�|�|�|�|�|�|�|�|�|
//
//�@�@�E�Z���̍�����ɃA�h���X��ݒ肷��B
//      �E�����i��j��0,1,2,..., �������i�s�j��0,1,2,..., �Ƃ���B
//         0     1     2     3     4
//    �@0 �|�|�|�|�|�|�|�|�|�|�|�|�|
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//    �@1 �|�|�|�|�|�|�|�|�|�|�|�|�|      �ΐ����̃Z���̃A�h���X�́A(2,1)
//        �b�@�@�b�@�@�b////�b�@�@�b�@   
//        �b�@�@�b�@�@�b////�b�@�@�b�@   
//    �@2 �|�|�|�|�|�|�|�|�|�|�|�|�|
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//    �@3 �|�|�|�|�|�|�|�|�|�|�|�|�|
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//        �b�@�@�b�@�@�b�@�@�b�@�@�b�@   
//    �@4 �|�|�|�|�|�|�|�|�|�|�|�|�|
//
//�@����{�I�ȏ�����
//
//    import java.applet.Applet; 
//    import java.awt.*;
//
//    public class �N���X�� extends Applet {
//
//      public void init() {
//
//�@�@  �@// �O���b�h�o�b�O���C�A�E�g�}�l�[�W���[�̍쐬�B
//        GridBagLayout gb = new GridBagLayout();
//
//        // �A�v���b�g�̃��C�A�E�g�}�l�[�W����GridBagLayout�ɐݒ�B
//        this.setLayout(gb);
//
//�@�@    // ���i�̈ʒu�֌W��`���w�肷��GridBagConstraints�I�u�W�F�N�g�̍쐬�B
//        GridBagConstraints gbc = new GridBagConstraints();
//     
//        // ���i�̍쐬�B
//        Button b = new Button("�{�^��");
//
//        // GridBagConstrints�N���X�̕ϐ����g���āA���i�̈ʒu��`���̏�����ݒ�B
//        gbc.gridx = 0; gbc.gridy = 0;
//
//        // ���i�Ə������֘A�Â���B
//        gb.setConstraints(b,gbc);
//
//        // �A�v���b�g�ɕ��i��z�u�B
//        this.add(b);
//
//      }
//
//    }
//
//�@��GridBagLayout�N���X
//�@�@�قȂ�傫���̕��i���i�q��ɔz�u����B
//
//�@��GridBagLayout�N���X�̃R���X�g���N�^
//�@�@GridLayout()
//�@�@�@�@�\�F�O���b�h�o�b�O���C�A�E�g�}�l�[�W���[���쐬����B
//
//  ��GridBagLayout�N���X�̃��\�b�h
//�@�@void setConstraints(Component c, GridBagConstraints gbc)
//      �@�\�F���ic�ɏ���gbc��ݒ肷��B
//
//�@��GridBagConstraints�N���X
//�@�@���i�̈ʒu�֌W��`���w�肷��B
//
//�@��GridBagConstraints�N���X�̃R���X�g���N�^
//�@�@GridBagConstraints()
//      �@�\�FGridBagConstraints�I�u�W�F�N�g���쐬����B
//
//�@��GridBagConstrints�N���X�̕ϐ�
//
//    public int gridx  �f�t�H���g�́ARELATIVE�B
//�@�@�@�@�@���i�̈ʒu��������gridx+1��ڂł��邱�Ƃ��w�肷��B
//�@�@�@�@�@���Ȃ킿�Agridx=0���P��ځAgridx=1���Q��ځA�E�E�E�B
//    �@�@�@���̕��i���ǉ�����钼�O�ɃR���e�i�ɒǉ����ꂽ���i��
//�@�@�@�@�@����ɔz�u����ɂ́ARELATIVE�Ǝw�肷��B 
//
//    public int gridy   �f�t�H���g�́ARELATIVE�B
//�@�@�@�@�@���i�̈ʒu���ォ��gridy+1�s�ڂł��邱�Ƃ��w�肷��B
//�@�@�@�@�@���Ȃ킿�Agridy=0���P�s�ځAgridy=1���Q�s�ځA�E�E�E�B
//    �@�@�@���̕��i���ǉ�����钼�O�ɃR���e�i�ɒǉ����ꂽ���i��
//�@�@�@�@�@�����ɔz�u����ɂ́ARELATIVE�Ǝw�肷��B 
//�@�@�@�@�@�@�@�@�@�@  
//    public int gridwidth   �f�t�H���g�͂P�B 
//�@�@�@�@�@���i���g����(��)�B
//�@�@�@�@�@���i�̕\���̈悪 gridx���炻�̍s�̍Ō�̃Z���܂łł��邱�Ƃ�
//�@�@�@�@�@�w�肷��ɂ́AREMAINDER�Ƃ���B
//�@�@�@�@�@���i�̕\���̈悪 gridx���炻�̍s�̍Ō��1��O�̃Z���܂łł��邱�Ƃ�
//    public int ipadx   �f�t�H���g��0�B
//          ���i�̍ŏ����ɒǉ�����̈�̒l���w�肷��B�P�ʂ̓s�N�Z���B
// 
//    public int ipady   �f�t�H���g��0�B
//          ���i�̍ŏ��̍����ɒǉ�����̈�̒l���w�肷��B�P�ʂ̓s�N�Z���B 
//
//�@�@�@�@�@�w�肷��ɂ́ARELATIVE �Ƃ��� 
//
//    public int gridheight   �f�t�H���g�͂P�B
//�@�@�@�@�@���i���g������(�s��)�B
//�@�@�@�@�@���i�̕\���̈悪 gridy���炻�̗�̍Ō�̃Z���܂łł��邱�Ƃ�
//�@�@�@�@�@�w�肷��ɂ́AREMAINDER�Ƃ���B
//�@�@�@�@�@���i�̕\���̈悪 gridx���炻�̗�̍Ō��1��O�̃Z���܂łł��邱�Ƃ�
//�@�@�@�@�@�w�肷��ɂ́ARELATIVE �Ƃ��� 
//
//    public int ipadx   �f�t�H���g��0�B
//          ���i�̍ŏ����ɒǉ�����̈�̒l���w�肷��B�P�ʂ̓s�N�Z���B
// 
//    public int ipady   �f�t�H���g��0�B
//          ���i�̍ŏ��̍����ɒǉ�����̈�̒l���w�肷��B�P�ʂ̓s�N�Z���B 
//
////////////////////////////////////////////////////////////////////////////////
