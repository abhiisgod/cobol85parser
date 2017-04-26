       Identification Division.
       Program-ID. ExecSqlIms.       
       Procedure Division.
       
        EXEC SQLIMS
          DECLARE SOMECUR CURSOR FOR DYSQL 
        END-EXEC.
        
        EXEC SQLIMS 
          OPEN SOMECUR
        END-EXEC.
        
        EXEC SQLIMS
          FETCH SOMECUR INTO :SOMECOL1, :SOMECOL2
        END-EXEC.
        
        IF SQLIMSCODE = 100
          PERFORM NO-DATA-FOUND
        ELSE
          PERFORM LOAD-DATA UNTIL SQLIMSCODE NOT EQUAL TO ZERO.

        EXEC SQLIMS
          CLOSE SOMECUR 
        END-EXEC.