// -*- mode: java -*- Time-stamp: <2009-07-03 16:17:38 kahata>
/*====================================================================
 * name: db121.java 
 * created : Time-stamp: <09/07/03(��) 16:16:59 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/DATABASE/db121.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db121.java >>
//
//�@�f�[�^�x�[�X�i�Q�j�F�g�����U�N�V���������i�T���j
//
//�@���g�����U�N�V��������
//
//�@�@��A�̂܂Ƃ܂����f�[�^�x�[�X�����i�X�V�A�Q�Ɓj���g�����U�N�V���������Ƃ����B
//
//�@�@�E������
//
//        // �f�[�^�x�[�X�ւ̐ڑ��B
//        Connection cn = DriverManager.getConnection(url,user,passwd);
//        // �����R�~�b�g�𖳌��Ƃ��ăg�����U�N�V�����������J�n����B
//�@�@�@�@cn.setAutoCommit(false); 
//        try{
//          �f�[�^�x�[�X�����i��������e�[�u�������b�N)
//          �f�[�^�x�[�X�����iSQL��)
//          �c�c
//          �f�[�^�x�[�X�����iSQL��)
//�@�@�@�@�@cn.commit(); // �g�����U�N�V���������ōs��ꂽ�ύX��L���Ƃ��A
//�@�@�@�@�@�@�@�@�@�@�@ // ����I���B
//        } catch( Exception e ) {
//          cn.rollback(); // �g�����U�N�V���������ōs��ꂽ�ύX�𖳌��Ƃ��A
//�@�@�@�@�@�@�@�@�@�@�@�@ // �ُ�I���B
//        } finally {
//          cn.setAutoCommit(true); // �����R�~�b�g��L���Ƃ���B
//        }
//
//�@��java.sql.Connection�C���^�[�t�F�[�X
//�@�@����̃f�[�^�x�[�X�Ƃ̐ڑ�(�Z�b�V����)��\������B�ڑ��̃R���e�L�X�g����
//�@�@SQL�������s���ꌋ�ʂ��Ԃ����B
//
//�@��Connection�C���^�[�t�F�[�X�̃��\�b�h
//    public void setAutoCommit(boolean b) throws SQLException
//    �@�@�\�F�ڑ��̎����R�~�b�g���[�hb��ݒ肷��B
//�@�@�@�@�@�@�����R�~�b�g���[�hb��true �̏ꍇ�A�����R�~�b�g���L���A
//�@�@�@�@�@�@false �̏ꍇ�A�����R�~�b�g�������ƂȂ�B
//�@�@�@�@�@�@�ڑ��������R�~�b�g���[�h�̏ꍇ�A�ЂƂ�SQL�����A�g�����U�N�V����
//�@�@�@�@�@�@�Ƃ��ď��������B�����łȂ��ꍇ�A�g�����U�N�V�����������J�n����A
//�@�@�@�@�@�@������SQL�������s���ꂽ��Acommit���\�b�h�܂���rollback���\�b�h��
//�@�@�@�@�@�@�g�����U�N�V���������͏I������B
//�@�@�@�@�@�@�f�t�H���g�́A�����R�~�b�g���[�h�ƂȂ�B
//    public void commit() throws SQLException
//�@�@�@�@�\�F�g�����U�N�V���������ōs��ꂽ�ύX��L���Ƃ��A�g�����U�N�V����
//�@�@�@�@�@�@�������̃f�[�^�x�[�X���b�N�����ׂĉ�������B
//�@�@�@�@�@�@���̃��\�b�h�́A�����R�~�b�g���[�h�������̏ꍇ�Ɏg����B
//    public void rollback() throws SQLException
//�@�@�@�@�\�F�g�����U�N�V���������ōs��ꂽ�ύX�𖳌��Ƃ��A�g�����U�N�V����
//�@�@�@�@�@�@�������̃f�[�^�x�[�X���b�N�����ׂĉ�������B
//�@�@�@�@�@�@���̃��\�b�h�́A�����R�~�b�g���[�h�������̏ꍇ�Ɏg����B
//
///////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
