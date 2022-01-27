/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     19/01/2022 06:33:38                          */
/*==============================================================*/


drop table if exists Association;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE if exists Compte;
SET FOREIGN_KEY_CHECKS = 1;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE if exists Membre;
SET FOREIGN_KEY_CHECKS = 1;

drop table if exists Pret;

drop table if exists Transaction;

/*==============================================================*/
/* Table: Association                                           */
/*==============================================================*/
create table Association
(
   id_association       int,
   nom_association      varchar(254),
   compte_principal     int,
   compte_association   int
);

/*==============================================================*/
/* Table: Compte                                                */
/*==============================================================*/
create table Compte
(
   num_compte           int not null,
   montant_principale   int,
   montant_epargne      int,
   montant_secours      int,
   montant_ration       int,
   montant_transport    int,
   montant_developpement int,
   primary key (num_compte)
);

/*==============================================================*/
/* Table: Membre                                                */
/*==============================================================*/
create table Membre
(
   id_membre            int not null,
   num_compte        int,
   passwords            varchar(254),
   nom_membre           varchar(254),
   prenom_membre        varchar(254),
   date_naiss           datetime,
   num_cni              varchar(254),
   etat_civil           varchar(254),
   personne_a_contacter int,
   genre                national char(1),
   statut               varchar(254),
   primary key (id_membre)
);

/*==============================================================*/
/* Table: Pret                                                  */
/*==============================================================*/
create table Pret
(
   id_membre_pret       int,
   num_pret             int,
   montant_pret         int
);

/*==============================================================*/
/* Table: Transaction                                           */
/*==============================================================*/
create table Transaction
(
   id_membre_trans      int,
   num_transaction      int,
   num_compte           int,
   type_transaction     varchar(254)
);

alter table Association add constraint FK_appartenir foreign key (id_association)
      references Membre (id_membre) on delete cascade on update cascade;

alter table Membre add constraint FK_avoir foreign key (compte_membre)
      references Compte (num_compte) on delete cascade on update cascade;

alter table Pret add constraint FK_faire foreign key (id_membre_pret)
      references Membre (id_membre) on delete cascade on update cascade;

alter table Transaction add constraint FK_effectuer foreign key (id_membre_trans)
      references Membre (id_membre) on delete cascade on update cascade;

