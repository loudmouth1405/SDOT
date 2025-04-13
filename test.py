from graphviz import Digraph

# Create a directed graph
dot = Digraph(comment='Lattice for Subjects and Their Clearances')

# Define the clearance levels and relationships
dot.node('TS', 'TS, {FIN, HR, IT, CLIENT}')
dot.node('S1', 'S, {FIN, HR, IT}')
dot.node('S2', 'S, {FIN, CLIENT}')
dot.node('S3', 'S, {HR, CLIENT}')
dot.node('C1', 'C, {CLIENT, IT}')
dot.node('C2', 'C, {FIN}')
dot.node('C3', 'C, {HR}')
dot.node('UC', 'UC, Ø')

# Define edges to represent the ordering in the lattice
dot.edge('TS', 'S1')
dot.edge('TS', 'S2')
dot.edge('TS', 'S3')
dot.edge('S1', 'C1')
dot.edge('S1', 'C2')
dot.edge('S3', 'C3')
dot.edge('C1', 'UC')
dot.edge('C2', 'UC')
dot.edge('C3', 'UC')

# Render and display the lattice
dot
