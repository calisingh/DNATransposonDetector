import java.io.*;
import java.io.IOException;

//
// Writes a fasta record to a print writer.
//

public class FastaWriter {

	private PrintWriter thePrintWriter;

	public FastaWriter(PrintWriter thePrintWriter) {
		this.thePrintWriter = thePrintWriter;
	}

	// Write the rec as 2 separate lines: first the defline, then the sequence.
	// To write something on a separate line, use the println() method of
	// PrintWriter.
	public void writeRecord(FastaRecord record) throws IOException {
		thePrintWriter.println(record.getDefline());
		thePrintWriter.println(record.getSequence());

	}
}
